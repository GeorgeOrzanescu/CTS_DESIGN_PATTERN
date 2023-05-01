package CTS.practice.creationale.SINGLETON.problema3;

public class ConfigAplicatie {
    private int numarThreaduri;
    private TipMediuDezvoltare tipMediuDezvoltare;

    private static ConfigAplicatie configAplicatie = null;

    private ConfigAplicatie() {
    }

    public void setNumarThreaduri(int numarThreaduri) {
        this.numarThreaduri = numarThreaduri;
    }

    public void setTipMediuDezvoltare(TipMediuDezvoltare tipMediuDezvoltare) {
        this.tipMediuDezvoltare = tipMediuDezvoltare;
    }

    public static synchronized ConfigAplicatie getInstance() {
        if(configAplicatie != null) {
            return configAplicatie;
        }
        return new ConfigAplicatie();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfigAplicatie{");
        sb.append("numarThreaduri=").append(numarThreaduri);
        sb.append(", tipMediuDezvoltare=").append(tipMediuDezvoltare);
        sb.append('}');
        return sb.toString();
    }
}
