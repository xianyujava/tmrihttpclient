package com.sanlian.core.bean;

import java.io.Serializable;

/**
 * @ClassName Netjyry
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/25
 **/
public class Netjyry implements Serializable {
    String jhxh = "";
    String fzjg = "";

    public String getJhxh() {
        return jhxh;
    }

    public void setJhxh(String jhxh) {
        this.jhxh = jhxh;
    }

    public String getFzjg() {
        return fzjg;
    }

    public void setFzjg(String fzjg) {
        this.fzjg = fzjg;
    }
}
