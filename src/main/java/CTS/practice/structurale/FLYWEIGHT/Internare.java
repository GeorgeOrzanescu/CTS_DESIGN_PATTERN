package CTS.practice.structurale.FLYWEIGHT;

public class Internare implements IInternare {

    private String numePacient;
    private String numarTelefon;
    private String adresa;

    public Internare(String numePacient, String numarTelefon, String adresa) {
        this.numePacient = numePacient;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public void descriere(DateInternare dateInternare) {
        System.out.println(this);
        System.out.println(dateInternare);
    }

    public String getNumePacient() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Internare [numePacient=" + numePacient + ", numarTelefon=" + numarTelefon + ", adresa=" + adresa + "]";
    }
}
