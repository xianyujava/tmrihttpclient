package com.sanlian.core.impl;

import com.sanlian.boot.annotation.TmriClientScan;
import com.sanlian.core.bean.*;
import com.sanlian.core.service.TmriHttpClient;

/**
 * @ClassName TmriHttpClientImpl
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/23
 **/

public class TmriHttpClientImpl implements TmriHttpClient {

    /**
     * 接口D020 读取现场/体验教育信息接口
     *
     * @throws Exception
     */
    @TmriClientScan
    public String _20C13(Netmfjyj netmfjyj) throws Exception {
        return getDefaulResult();
    }

    /**
     * 接口D021 读取现场/体验教育人员信息接口
     *
     * @throws Exception
     */
    @TmriClientScan
    public String _20C14(Netjyry netjyry) throws Exception {
        return getDefaulResult();
    }

    /**
     * 接口D023 体验教育写入接口
     *
     * @throws Exception
     */
    @TmriClientScan
    public String _20C15(Nettyjy nettyjy) throws Exception {
        return getDefaulResult();
    }

    /**
     * 整体照片写入
     * @param netztzp
     * @return
     * @throws Exception
     */
    @Override
    @TmriClientScan
    public String _20C16(Netztzp netztzp) throws Exception {
        return getDefaulResult();
    }

    @Override
    @TmriClientScan
    public String _20C17(Netztsp netztsp) throws Exception {
        return getDefaulResult();
    }

    /**
     * 接口D031 签到签退身份核查通用接口
     *
     * @throws Exception
     */
    @TmriClientScan
    public String _20C18(Netqtsfhc netqtsfhc) throws Exception {
        return getDefaulResult();
    }

    /**
     * 接口D032 签到签退写入通用接口
     *
     * @throws Exception
     */
    @TmriClientScan
    public String _20C19(Netqdqt netqdqt) throws Exception {
        return getDefaulResult();
    }

    /**
     * 接口D012 现场/体验教育现场强制人工签退信息写入接口
     *
     * @throws Exception
     */
    @TmriClientScan
    public String _20C12(Netrgqt netrgqt) throws Exception {
        return getDefaulResult();
    }

    @Override
    @TmriClientScan
    public String _20C11(HealthMidBean healthMidBean) throws Exception {
        return getDefaulResult();
    }

    @Override
    @TmriClientScan
    public String _20C10(NetDrvPhotoPerson netDrvPhotoPerson) throws Exception {
        return getDefaulResult();
    }

}
