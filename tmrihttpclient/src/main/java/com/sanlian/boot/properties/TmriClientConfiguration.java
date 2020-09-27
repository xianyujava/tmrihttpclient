package com.sanlian.boot.properties;

/**
 * @ClassName TmriClientConfiguration
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/23
 **/
public class TmriClientConfiguration {
    private String siteId = "000001";//用户互认接口，本接口该参数无效
    private String serverId;

    private String clientId;//

    private String privateKey;//

    private String publicKey;//

    private String password;//

    private String serverUrl;//

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * 无需更改
     *
     * @return
     */
    public String getServerId() {
        return this.serverId;
    }

    /**
     * TODO 联系系统管理员获取接口备案系统代码
     *
     * @return
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * TODO 联系系统管理员获取接口备案私钥
     *
     * @return
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * 无需更改
     *
     * @return
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * TODO 联系系统管理员获取接口备案密码
     *
     * @return
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * TODO 替换域名为实际互联网服务平台域名
     *
     * @return
     */
    public String getServerUrl() {
        return this.serverUrl;
    }

    public static TmriClientConfiguration configuration() {
        TmriClientConfiguration tmriClientConfiguration = new TmriClientConfiguration();
        return tmriClientConfiguration;
    }
}
