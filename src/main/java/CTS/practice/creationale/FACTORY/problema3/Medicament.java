package CTS.practice.creationale.FACTORY.problema3;

public abstract class Medicament {
    int pret;
    String denumire;

    public Medicament(int pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public abstract void descriere();
}
