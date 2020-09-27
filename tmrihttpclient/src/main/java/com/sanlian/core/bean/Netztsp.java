package com.sanlian.core.bean;

import java.io.Serializable;

/**
 * @ClassName Netztsp
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/25
 **/
public class Netztsp implements Serializable {
    String jhxh = "";
    String kssj = "";
    String jssj = "";
    String cjsm = "";
    String url = "";

    public String getJhxh() {
        return jhxh;
    }

    public void setJhxh(String jhxh) {
        this.jhxh = jhxh;
    }

    public String getKssj() {
        return kssj;
    }

    public void setKssj(String kssj) {
        this.kssj = kssj;
    }

    public String getJssj() {
        return jssj;
    }

    public void setJssj(String jssj) {
        this.jssj = jssj;
    }

    public String getCjsm() {
        return cjsm;
    }

    public void setCjsm(String cjsm) {
        this.cjsm = cjsm;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
