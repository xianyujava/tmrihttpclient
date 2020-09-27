package com.sanlian.core.bean;

public class VertifyUserBean {

        private String sfzmmc; // 身份证明名称
        private String sfzmhm; // 身份证明号码
        private String sjhm; // 手机号码
        private String xm;  //姓名
        private String gnid;//功能ID,跳转到指定页面

        public String getSfzmmc() {
                return sfzmmc;
        }

        public void setSfzmmc(String sfzmmc) {
                this.sfzmmc = sfzmmc;
        }

        public String getSfzmhm() {
                return sfzmhm;
        }

        public void setSfzmhm(String sfzmhm) {
                this.sfzmhm = sfzmhm;
        }

        public String getSjhm() {
                return sjhm;
        }

        public void setSjhm(String sjhm) {
                this.sjhm = sjhm;
        }

        public String getXm() {
                return xm;
        }

        public void setXm(String xm) {
                this.xm = xm;
        }

        public String getGnid() {
                return gnid;
        }

        public void setGnid(String gnid) {
                this.gnid = gnid;
        }
}
