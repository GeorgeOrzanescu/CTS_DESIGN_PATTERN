package CTS.practice.comportamentale.Memento;

import java.util.Arrays;

public class ConfigurareProxy {
    private String targetUrl;
    private String[] blacklist;
    private String[] whitelist;
    private int securityLvl;


    public ConfigurareProxy(String targetUrl, String[] blacklist, String[] whitelist, int securityLvl) {
        this.targetUrl = targetUrl;
        this.blacklist = blacklist;
        this.whitelist = whitelist;
        this.securityLvl = securityLvl;
    }


    public MementoConfigurareProxy createMementoConfigProxy() {
        return new MementoConfigurareProxy(this.targetUrl,this.securityLvl);
    }

    public void setMementoConfigProxy(MementoConfigurareProxy mementoConfigProxy) {
        this.targetUrl = mementoConfigProxy.getTargetUrl();
        this.securityLvl = mementoConfigProxy.getSecurityLvl();
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public void setSecurityLvl(int securityLvl) {
        this.securityLvl = securityLvl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfigurareProxy{");
        sb.append("targetUrl='").append(targetUrl).append('\'');
        sb.append(", blacklist=").append(Arrays.toString(blacklist));
        sb.append(", whitelist=").append(Arrays.toString(whitelist));
        sb.append(", securityLvl=").append(securityLvl);
        sb.append('}');
        return sb.toString();
    }
}
