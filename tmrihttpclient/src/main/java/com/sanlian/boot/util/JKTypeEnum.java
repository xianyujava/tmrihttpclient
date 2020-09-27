package com.sanlian.boot.util;/**
 * Created by Soft001 on 2020/9/24.
 */

/**
 * @ClassName JKTypeEnum
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/24
 * @Version V1.0
 **/
public enum JKTypeEnum {
    _20C13("/ws/m/drv/geteduplanlist"), _20C11("/pub/drv/savehealthinfo"), _20C12("/ws/m/drv/saveqzqtinfo"), _20C14("/ws/m/drv/getxcjyxylist"), _20C15("/ws/m/drv/savetyjyinfo"), _20C16("/ws/m/drv/savexcjyphoto"), _20C17("/ws/m/drv/savexcjyvideo"), _20C18("/ws/m/drv/comm/checksigned"), _20C19("/ws/m/drv/comm/signed"), _20C10("/drvphoto/upload"),
    _20C20("/ws/m/drv/getxcjypic");
    private String path;

    JKTypeEnum(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
