package com.sanlian.boot.util;

import java.io.Serializable;

/**
 * @ClassName RespBody
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/8/19
 **/

public class RespBody implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code = "0";
    private String message = "请求失败";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
