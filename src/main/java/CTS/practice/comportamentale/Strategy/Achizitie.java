package CTS.practice.comportamentale.Strategy;

public class Achizitie {
    private float sumaInternare;
    private IModalitatePlata modalitatePlata;

    public Achizitie(float sumaInternare) {
        this.sumaInternare = sumaInternare;
    }

    public void setModalitatePlata(IModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void achizitioneaza() {
        System.out.println("Sa platit suma de " + sumaInternare);
        modalitatePlata.plateste();
    }

}
