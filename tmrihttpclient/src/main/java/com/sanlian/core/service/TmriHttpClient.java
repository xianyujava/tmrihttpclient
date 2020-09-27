package com.sanlian.core.service;/**
 * Created by Soft001 on 2020/9/23.
 */

import com.sanlian.boot.util.ObjectJsonSerializer;
import com.sanlian.boot.util.RespBody;
import com.sanlian.core.bean.*;

/**
 * @ClassName TmriHttpClient
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/23
 * @Version V1.0
 **/
public interface TmriHttpClient {
    default String getDefaulResult() {
        return ObjectJsonSerializer.serialize(new RespBody());
    }

    /**
     * D020  读取现场教育信息接口
     * @return
     * @throws Exception
     */
    String _20C13(Netmfjyj netmfjyj) throws Exception;

    /**
     * 接口D021 读取现场/体验教育人员信息接口
     *
     * @throws Exception
     */

    String _20C14(Netjyry netjyry) throws Exception;

    /**
     * 接口D023 体验教育写入接口
     *
     * @throws Exception
     */

    String _20C15(Nettyjy nettyjy) throws Exception;


    /**
     * 接口D024 整体照片信息写入接口
     *
     * @throws Exception
     */

    String _20C16(Netztzp netztzp) throws Exception;

    /**
     * 接口D025 整体视频信息写入接口
     *
     * @throws Exception
     */

    String _20C17(Netztsp netztsp) throws Exception;


    /**
     * 接口D031 签到签退身份核查通用接口
     *
     * @throws Exception
     */

    String _20C18(Netqtsfhc netqtsfhc) throws Exception;

    /**
     * 接口D032 签到签退写入通用接口
     *
     * @throws Exception
     */

    String _20C19(Netqdqt netqdqt) throws Exception;

    /**
     * 接口D012 现场/体验教育现场强制人工签退信息写入接口
     *
     * @throws Exception
     */

    String _20C12(Netrgqt netrgqt) throws Exception;

    /**
     * 体检信息写入接口20C11
     *
     * @param healthMidBean
     * @return
     * @throws Exception
     */
    String _20C11(HealthMidBean healthMidBean) throws Exception;

    /**
     *  驾驶证证件照片接口写入
     * @param netDrvPhotoPerson
     * @return
     * @throws Exception
     */
    String _20C10(NetDrvPhotoPerson netDrvPhotoPerson) throws Exception;
}
