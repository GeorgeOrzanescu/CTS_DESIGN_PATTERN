package CTS.practice.teste.categoria1.test_builder_factory;

public class BuilderBicicleta implements IBuilder{
    private float diametru;
    private String tipFrana;
    private boolean areCasca;
    private boolean areOchelari;

    public BuilderBicicleta() {
        this.diametru = 0;
        this.tipFrana = "";
        this.areCasca = false;
        this.areOchelari = false;
    }

    @Override
    public IBicicleta build() {
        Bicicleta bicicletaFinala = new Bicicleta(diametru,tipFrana,areCasca,areOchelari);
        clearBuilder();

        return bicicletaFinala;
    }
    public BuilderBicicleta seteazaDiametruRoti(float diametru) {
        this.diametru = diametru;
        return this;
    }

    public BuilderBicicleta seteazaTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }


    public BuilderBicicleta seteazaCascaProtectie(boolean areCasca) {
        this.areCasca = areCasca;
        return this;
    }

    public BuilderBicicleta seteazaOchelari(boolean areOchelari) {
        this.areOchelari = areOchelari;
        return this;
    }

    private void clearBuilder() {
        this.diametru = 0;
        this.tipFrana = "";
        this.areCasca = false;
        this.areOchelari = false;
    }

}
