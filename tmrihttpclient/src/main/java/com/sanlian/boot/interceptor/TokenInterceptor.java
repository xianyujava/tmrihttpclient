package com.sanlian.boot.interceptor;

import com.sanlian.boot.util.JKTypeEnum;
import com.sanlian.boot.annotation.TmriClientScan;
import com.sanlian.boot.properties.TmriClientConfiguration;
import com.sanlian.boot.util.ObjectJsonSerializer;
import com.tmri.comm.pps.ProtocolConstants;
import com.tmri.comm.pps.client.IObjectByteArrayConverter;
import com.tmri.comm.pps.client.NetServiceInvoker;
import com.tmri.comm.pps.client.bean.AesResult;
import com.tmri.comm.pps.client.bean.AesToken;
import com.tmri.comm.pps.client.bean.CryptInfo;
import com.tmri.comm.pps.comm.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TokenInterceptor
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/23
 **/
@Component
@Aspect
public class TokenInterceptor {
    @Resource
    TmriClientConfiguration tmriClientConfiguration;
    public NetServiceInvoker invoker;//调用服务端的封装类
    public AesToken token;//存储AES对称加密秘钥类

    @Pointcut("@annotation(com.sanlian.boot.annotation.TmriClientScan)")
    public void execMethod() {

    }

    @Around("execMethod()")
    public Object invoke(ProceedingJoinPoint invocation) throws Throwable {
        Object msg = invocation.proceed();
        try {
            Object[] args = invocation.getArgs();
            Signature sig = invocation.getSignature();
            String methdName = sig.getName();
            Class[] parameterTypes = ((MethodSignature) sig).getMethod().getParameterTypes();
            Method method = invocation.getTarget().getClass().getMethod(methdName, parameterTypes);
            JKTypeEnum jkTypeEnum = JKTypeEnum.valueOf(invocation.getSignature().getName());
            getNetServiceInvoker();
            NetClientRequest clientRequest = buildRequest();
            clientRequest.setCryptType(IHttpCryptData.CryptType.NO_CRYPT);
            clientRequest.setCompressType(IHttpCompressData.CompressType.NO_COMPRESS);

            AesToken tokenHard =
                    getTokenHard(new CryptInfo(clientRequest.getCryptType(),
                            clientRequest.getClientId(),
                            clientRequest.getMajor(),
                            clientRequest.getMinor()));
            clientRequest.setMinor(tokenHard.getVersion());

            clientRequest.setRequestUrl(tmriClientConfiguration.getServerUrl() + jkTypeEnum.getPath());
            clientRequest.setInterfaceId(jkTypeEnum.name());
            //设置参数
            processParams(method, args, clientRequest);
            //调用接口
            NetClientResponse result = invoker.doPost(clientRequest);
            msg = result.getData().toString();
        } catch (Exception e) {
            invoker = null;
            token = null;
        }
        return msg;
    }

    protected NetClientRequest buildRequest() {
        NetClientRequest clientRequest = new NetClientRequest();
        clientRequest.setSiteId(tmriClientConfiguration.getSiteId());
        clientRequest.setServerId(tmriClientConfiguration.getServerId());// 互联网省份代码
        clientRequest.setClientId(tmriClientConfiguration.getClientId());//分配给第三方系统的代码
        clientRequest.setMajor(String.valueOf(ProtocolConstants.HEADER_MARJOR));
        clientRequest.setCompressType(HttpCompressData.CompressType.GZIP);
        clientRequest.setCryptType(IHttpCryptData.CryptType.AES_CRYPT);//普通请求采用aes算法，aes算法中的token，使用rsa算法加密请求。
        return clientRequest;
    }

    public AesToken getTokenHard(CryptInfo info) {
        if (token == null || isExpired(token)) {
            NetClientRequest clientRequest = buildRequest();
            //线上环境 请切换此url为 http://gab.122.gov.cn/ws/m/token/generate
            clientRequest.setRequestUrl(tmriClientConfiguration.getServerUrl() + "/ws/m/token/generate");//生成token服务类。
            clientRequest.setCryptType(IHttpCryptData.CryptType.RSA_CRYPT);//token生成过程采用rsa算法。
            clientRequest.setCompressType(IHttpCompressData.CompressType.GZIP);
            clientRequest.setClientId(info.getClientId());
            try {
                NetClientResponse response = invoker.doPost(clientRequest);
                //System.out.println("code:{},mes:{},data:{}"
                //        + response.getData().toString());
                AesResult tokenresult = ObjectJsonSerializer.deSerialize(
                        AesResult.class, response.getData().toString());
                token = tokenresult.getData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return token;
    }

    protected boolean isExpired(AesToken token) {
        if (token.getExpiry() != null && !"".equals(token.getExpiry())) {
            return true;
        }
        DateTime time = new DateTime(new Date(Long.valueOf(token.getExpiry())));
        //System.out.println(time.toDate());
        return DateTime.now().isAfter(time);
    }

    public synchronized void getNetServiceInvoker() {
        if (invoker == null) {
            //第一步：构造NetServiceInvoker，需要两个参数：分别是：BaseHttpCryptData和IObjectByteArrayConverter
            invoker = new NetServiceInvoker(
                    //参数一：NetServiceInvoker的加解密封装类，采用模板模式，只需要实现如下接口
                    new BaseHttpCryptData() {
                        //(1)互联网服务平台公钥，由互联网服务平台统一分配.
                        @Override
                        public String getPublicKey(CryptInfo cryptInfo) {
                            return tmriClientConfiguration.getPublicKey();

                        }

                        //(2)第三方接入平台私钥，由互联网服务平台统一分配.
                        @Override
                        public String getPrivateKey() {
                            return tmriClientConfiguration.getPrivateKey();
                        }

                        //(3)第三方接入平台RSA算法密码，由互联网服务平台统一分配.
                        @Override
                        public String getPassword() {
                            return tmriClientConfiguration.getPassword();
                        }


                        //(4)返回clientID,由互联网服务平台统一分配.
                        @Override
                        public String getClientId() {
                            return tmriClientConfiguration.getClientId();
                        }

                        //(5)第三方接入平台获取AesToken算法。请参考实现
                        @Override
                        public AesToken getToken(CryptInfo info) {
                            return getTokenHard(info);
                        }
                    },
                    //参数二：NetServiceInvoker的java对象序列化封装类。要求将java对象序列化为json后，转化为byte[].其他格式，服务端不识别
                    new IObjectByteArrayConverter() {
                        @Override
                        public byte[] convert(Object o) {
                            String serialize = ObjectJsonSerializer.serialize(o);
                            if (serialize != null && !serialize.isEmpty()) {
                                try {
                                    return serialize
                                            .getBytes(ProtocolConstants.APP_CHARSET_UTF8);
                                } catch (UnsupportedEncodingException e) {
                                    e.printStackTrace();
                                }
                            }

                            return new byte[0];
                        }

                        //可以不实现
                        @Override
                        public Object toBean(byte[] bytes) {
                            return null;
                        }
                    });

        }
    }

    /**
     * 处理接口中定义的方法
     */
    private void processParams(Method method, Object[] args, NetClientRequest clientRequest) {

        if (method != null && method.isAnnotationPresent(TmriClientScan.class)) {
            TmriClientScan annotaion = method.getAnnotation(TmriClientScan.class);
            if (!"".equals(annotaion.functionId())) {
                clientRequest.setFunctionId(annotaion.functionId());
            }
            if (annotaion.paramNameInfo() != null && annotaion.paramNameInfo().length > 0) {
                Map<String, Object> map = new HashMap<String, Object>();
                String[] params = annotaion.paramNameInfo();
                int size = args.length;
                for (int i = 0; i < size; i++) {
                    map.put(params[i], args[i]);
                }
                //添加接口单例参数
                clientRequest.setData(ObjectJsonSerializer.serialize(map));
            } else {
                //添加接口实体参数
                clientRequest.setData(ObjectJsonSerializer.serialize(args[0]));
            }
        }
    }
}

