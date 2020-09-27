package com.sanlian.core.bean;

import java.io.Serializable;

/**
 * Created by xiahb on 2018/7/30.
 */
public class NetDrvPhotoPerson implements Serializable {
        /**
         * 照片ID(照片回执号 唯一)
         */
        private String id;
        /**
         * 发证机关
         */
        private String fzjg;
        /**
         * 身份证明号码(证件类型为身份证的，存证件号，其他证件类型，存证件类型+证件号码)
         */
        private String sfzmhm;
        /**
         * 姓名
         */
        private String xm;
        /**
         * 照片采集时间（照片采集的时间）
         */
        private String cjsj;
        /**
         * 状态 0-初始 1-审核通过 2-审核不通过
         */
        private String zt;

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getFzjg() {
                return fzjg;
        }

        public void setFzjg(String fzjg) {
                this.fzjg = fzjg;
        }

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

        public String getCjsj() {
                return cjsj;
        }

        public void setCjsj(String cjsj) {
                this.cjsj = cjsj;
        }

        public String getZt() {
                return zt;
        }

        public void setZt(String zt) {
                this.zt = zt;
        }
}
