package CTS.practice.teste.categoria1.test_prototype_factory;

public class Banner implements IReclama, IClone{
    private String numeProdusPromovat;
    private int latime;
    private int inaltime;
    private String orasPromovare;


    public Banner(String numeProdusPromovat, int latime, int inaltime, String orasPromovare) {
        this.numeProdusPromovat = numeProdusPromovat;
        this.latime = latime;
        this.inaltime = inaltime;
        this.orasPromovare = orasPromovare;
    }

    @Override
    public String getNumeProdusPromovat() {
        return null;
    }

    @Override
    public int getLatime() {
        return 0;
    }

    @Override
    public int getInaltime() {
        return 0;
    }

    @Override
    public String getOrasPromovare() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banner{");
        sb.append("numeProdusPromovat='").append(numeProdusPromovat).append('\'');
        sb.append(", latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append(", orasPromovare='").append(orasPromovare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IClone copiaza() throws CloneNotSupportedException {
        return (IClone) super.clone();
    }
}
