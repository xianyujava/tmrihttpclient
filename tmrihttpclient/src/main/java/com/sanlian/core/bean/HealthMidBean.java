package com.sanlian.core.bean;

import java.io.Serializable;

/**
 * TABLE:NET_TRFF_DRIVING_LICENSEN
 *
 * @author quanxw
 */
public class HealthMidBean implements Serializable {
    private static final long serialVersionUID = 87166836824612757L;
    private String sfzmmc = "";
    private String sfzmhm = "";
    /**
     * 身高
     */
    private String sg = "";
    /**
     * 左视力
     */
    private String zsl = "";
    /**
     * 右视力
     */
    private String ysl = "";
    /**
     * 辨色力
     */
    private String bsl = "";
    private String tl = "";
    /**
     * 联系地址
     */
    private String lxtz = "";
    /**
     * 右上肢
     */
    private String sz = "";
    /**
     * 左下肢
     */
    private String zxz = "";
    /**
     * 右下肢
     */
    private String yxz = "";
    /**
     * 躯干颈部
     */
    private String qgjb = "";
    /**
     * 体检日期
     */
    private String tjrq = "";
    /**
     * 体检医院名称
     */
    private String tjyymc = "";
    /**
     * 医师姓名
     */
    private String ysxm = "";
    /**
     * 备注
     */
    private String bz = "";
    /**
     * 性别
     */
    private String xb = "";
    /**
     * 姓名
     */
    private String xm = "";

    /**
     * 档案编号
     */
    private String dabh = "";

    /**
     * 左耳
     */
    private String zr = "";
    /**
     * 右耳
     */
    private String yr = "";
    /**
     * 左视力矫正
     */
    private String zsljz = "";
    /**
     * 右视力矫正
     */
    private String ysljz = "";
    /**
     * 左上肢
     */
    private String zsz = "";
    /**
     * 是否正常坐立
     */
    private String sfzzzl = "";

    private String jyw = "";

    /**
     * 发证机关
     */
    private String fzjg;
    /**
     * 上传状态
     */
    private String sczt = "0";

    /**
     * 是否提交身体条件证明 标记字段
     */
    private String sftjzm = "";

    /**
     * 取消提交
     */
    private String qxtj = "0";
    /**
     * 转入标记
     */
    private String zrbj = "0";

    /**
     * 医院用户类型
     */
    private String hosYhlx;
    /**
     * 医院用户代号
     */
    private String hosYhdh;
    /**
     * 医院发证机关
     */
    private String hosFzjg;


    /**
     * 外网流水号
     */
    private String wwlsh;

    /**
     * 准驾车型，
     */
    private String zjcx;
    /**
     * 当前办理体检的医院用户的用户代号
     */
    private String yhdh;
    /**
     * 打印体检表时需要，邮寄地址
     */
    private String yjdz;

    /**
     * 手机号码
     */
    private String sjhm;

    private String gj;

    /**
     * 根据档案编号查询的时候，由档案编号反查的身份证号码
     */
    private String showSfzmmc;
    private String showSfzmhm;
    private String queryByDabh;
    private String glbm;
    /**
     * 单眼视力障碍（1是2否）
     */
    private String dyslze;
    /**
     * 优眼水平视野
     */
    private String yyspsy;

    private String yysfjz;

    private String zysfjz;

    private String tlsfjz;

    /**
     * 体检医生姓名
     */
    private String tjysxm;
    /**
     * 体检情况详细说明
     */
    private String tjqkxxsm;

    public String getTjysxm() {
        return tjysxm;
    }

    public void setTjysxm(String tjysxm) {
        this.tjysxm = tjysxm;
    }

    public String getTjqkxxsm() {
        return tjqkxxsm;
    }

    public void setTjqkxxsm(String tjqkxxsm) {
        this.tjqkxxsm = tjqkxxsm;
    }

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

    public String getSg() {
        return sg;
    }

    public void setSg(String sg) {
        this.sg = sg;
    }

    public String getZsl() {
        return zsl;
    }

    public void setZsl(String zsl) {
        this.zsl = zsl;
    }

    public String getYsl() {
        return ysl;
    }

    public void setYsl(String ysl) {
        this.ysl = ysl;
    }

    public String getBsl() {
        return bsl;
    }

    public void setBsl(String bsl) {
        this.bsl = bsl;
    }

    public String getTl() {
        return tl;
    }

    public void setTl(String tl) {
        this.tl = tl;
    }

    public String getSz() {
        return sz;
    }

    public void setSz(String sz) {
        this.sz = sz;
    }

    public String getZxz() {
        return zxz;
    }

    public void setZxz(String zxz) {
        this.zxz = zxz;
    }

    public String getYxz() {
        return yxz;
    }

    public void setYxz(String yxz) {
        this.yxz = yxz;
    }

    public String getQgjb() {
        return qgjb;
    }

    public void setQgjb(String qgjb) {
        this.qgjb = qgjb;
    }

    public String getTjrq() {
        return tjrq;
    }

    public void setTjrq(String tjrq) {
        this.tjrq = tjrq;
    }

    public String getTjyymc() {
        return tjyymc;
    }

    public void setTjyymc(String tjyymc) {
        this.tjyymc = tjyymc;
    }

    public String getYsxm() {
        return ysxm;
    }

    public void setYsxm(String ysxm) {
        this.ysxm = ysxm;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSftjzm() {
        return sftjzm;
    }

    public void setSftjzm(String sftjzm) {
        this.sftjzm = sftjzm;
    }

    public String getDabh() {
        return dabh;
    }

    public void setDabh(String dabh) {
        this.dabh = dabh;
    }

    public String getJyw() {
        return jyw;
    }

    public void setJyw(String jyw) {
        this.jyw = jyw;
    }

    public String getZr() {
        return zr;
    }

    public void setZr(String zr) {
        this.zr = zr;
    }

    public String getYr() {
        return yr;
    }

    public void setYr(String yr) {
        this.yr = yr;
    }

    public String getZsljz() {
        return zsljz;
    }

    public void setZsljz(String zsljz) {
        this.zsljz = zsljz;
    }

    public String getYsljz() {
        return ysljz;
    }

    public void setYsljz(String ysljz) {
        this.ysljz = ysljz;
    }

    public String getZsz() {
        return zsz;
    }

    public void setZsz(String zsz) {
        this.zsz = zsz;
    }

    public String getYjdz() {
        return yjdz;
    }

    public void setYjdz(String yjdz) {
        this.yjdz = yjdz;
    }

    public String getSfzzzl() {
        return sfzzzl;
    }

    public void setSfzzzl(String sfzzzl) {
        this.sfzzzl = sfzzzl;
    }

    public String getFzjg() {
        return fzjg;
    }

    public void setFzjg(String fzjg) {
        this.fzjg = fzjg;
    }

    public String getSczt() {
        return sczt;
    }

    public void setSczt(String sczt) {
        this.sczt = sczt;
    }

    public String getQxtj() {
        return qxtj;
    }

    public void setQxtj(String qxtj) {
        this.qxtj = qxtj;
    }

    public String getHosYhlx() {
        return hosYhlx;
    }

    public void setHosYhlx(String hosYhlx) {
        this.hosYhlx = hosYhlx;
    }

    public String getHosYhdh() {
        return hosYhdh;
    }

    public void setHosYhdh(String hosYhdh) {
        this.hosYhdh = hosYhdh;
    }

    public String getHosFzjg() {
        return hosFzjg;
    }

    public void setHosFzjg(String hosFzjg) {
        this.hosFzjg = hosFzjg;
    }

    public String getZjcx() {
        return zjcx;
    }

    public void setZjcx(String zjcx) {
        this.zjcx = zjcx;
    }

    public String getWwlsh() {
        return wwlsh;
    }

    public void setWwlsh(String wwlsh) {
        this.wwlsh = wwlsh;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }


    public String getShowSfzmmc() {
        return showSfzmmc;
    }

    public void setShowSfzmmc(String showSfzmmc) {
        this.showSfzmmc = showSfzmmc;
    }

    public String getShowSfzmhm() {
        return showSfzmhm;
    }

    public void setShowSfzmhm(String showSfzmhm) {
        this.showSfzmhm = showSfzmhm;
    }

    public String getQueryByDabh() {
        return queryByDabh;
    }

    public void setQueryByDabh(String queryByDabh) {
        this.queryByDabh = queryByDabh;
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm;
    }

    public String getYhdh() {
        return yhdh;
    }

    public void setYhdh(String yhdh) {
        this.yhdh = yhdh;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getZrbj() {
        return zrbj;
    }

    public void setZrbj(String zrbj) {
        this.zrbj = zrbj;
    }

    public String getDyslze() {
        return dyslze;
    }

    public void setDyslze(String dyslze) {
        this.dyslze = dyslze;
    }

    public String getZysfjz() {
        return zysfjz;
    }

    public void setZysfjz(String zysfjz) {
        this.zysfjz = zysfjz;
    }

    public String getYysfjz() {
        return yysfjz;
    }

    public void setYysfjz(String yysfjz) {
        this.yysfjz = yysfjz;
    }

    public String getYyspsy() {
        return yyspsy;
    }

    public void setYyspsy(String yyspsy) {
        this.yyspsy = yyspsy;
    }

    public String getTlsfjz() {
        return tlsfjz;
    }

    public void setTlsfjz(String tlsfjz) {
        this.tlsfjz = tlsfjz;
    }

    public String getLxtz() {
        return lxtz;
    }

    public void setLxtz(String lxtz) {
        this.lxtz = lxtz;
    }
}
