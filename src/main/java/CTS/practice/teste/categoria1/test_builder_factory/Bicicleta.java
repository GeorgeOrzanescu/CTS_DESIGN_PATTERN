package CTS.practice.teste.categoria1.test_builder_factory;

import java.awt.desktop.AboutEvent;

public class Bicicleta implements IBicicleta {
    private float diametru;
    private String tipFrana;
    private boolean areCasca;
    private boolean areOchelari;

    public Bicicleta(float diametru, String tipFrana, boolean areCasca, boolean areOchelari) {
        this.diametru = diametru;
        this.tipFrana = tipFrana;
        this.areCasca = areCasca;
        this.areOchelari = areOchelari;
    }

    @Override
    public void setDiametruRoti(float diametru) {
        this.diametru = diametru;
    }

    @Override
    public void setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
    }

    @Override
    public void setCascaProtectie(boolean areCasca) {
        this.areCasca = areCasca;
    }

    @Override
    public void setOchelari(boolean areOchelari) {
        this.areOchelari = areOchelari;
    }

    @Override
    public void afiseazaBicicleta() {
        System.out.println(this);
    }

    @Override
    public void afiseazaModDeUtilizare() {
        System.out.println("dai la pedale!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bicicleta{");
        sb.append("diametru=").append(diametru);
        sb.append(", tipFrana='").append(tipFrana).append('\'');
        sb.append(", areCasca=").append(areCasca);
        sb.append(", areOchelari=").append(areOchelari);
        sb.append('}');
        return sb.toString();
    }
}
