package CTS.practice.teste.categoria1.test_builder_factory;

import java.awt.desktop.AboutEvent;

public class Bicicleta implements IBicicleta {
    private Float diametru;
    private String tipFrana;
    private Boolean areCasca;
    private Boolean areOchelari;

    public Bicicleta(float diametru, String tipFrana, boolean areCasca, boolean areOchelari) {
        this.diametru = diametru;
        this.tipFrana = tipFrana;
        this.areCasca = areCasca;
        this.areOchelari = areOchelari;
    }

    @Override
    public void setDiametruRoti(float diametru) {
        if(this.diametru != null ){
            throw new UnsupportedOperationException();
        }
        this.diametru = diametru;
    }

    @Override
    public void setTipFrana(String tipFrana) {
        if(this.tipFrana != null ){
            throw new UnsupportedOperationException();
        }
        this.tipFrana = tipFrana;

    }

    @Override
    public void setCascaProtectie(boolean areCasca) {
        if(this.areCasca != null ){
            throw new UnsupportedOperationException();
        }
        this.areCasca = areCasca;
    }

    @Override
    public void setOchelari(boolean areOchelari) {
        if(this.areOchelari != null ){
            throw new UnsupportedOperationException();
        }
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
