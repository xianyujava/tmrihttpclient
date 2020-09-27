package com.sanlian.core.bean;

import java.io.Serializable;

/**
 * @ClassName Netqtsfhc
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/25
 **/
public class Netqtsfhc implements Serializable {
    String sfzmhm = "";
    String xm = "";
    String deviceId = "";
    String devName = "";

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }
}
