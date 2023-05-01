package CTS.practice.comportamentale.Memento;

public class MementoConfigurareProxy {
    private String targetUrl;
    private int securityLvl;

    public MementoConfigurareProxy(String targetUrl, int securityLvl) {
        this.targetUrl = targetUrl;
        this.securityLvl = securityLvl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public int getSecurityLvl() {
        return securityLvl;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MementoConfigurareProxy{");
        sb.append("targetUrl='").append(targetUrl).append('\'');
        sb.append(", securityLvl=").append(securityLvl);
        sb.append('}');
        return sb.toString();
    }
}
