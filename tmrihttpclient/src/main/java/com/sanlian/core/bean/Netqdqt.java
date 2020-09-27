package com.sanlian.core.bean;

import java.io.Serializable;

/**
 * @ClassName Netqdqt
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/25
 **/
public class Netqdqt implements Serializable {
    String sfzmhm = "";
    String xm = "";
    String type = "";
    String deviceId = "";
    String devName = "";
    String zp = "";

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getZp() {
        return zp;
    }

    public void setZp(String zp) {
        this.zp = zp;
    }
}
