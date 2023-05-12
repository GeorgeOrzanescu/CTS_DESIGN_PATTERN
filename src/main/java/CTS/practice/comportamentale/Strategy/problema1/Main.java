package CTS.practice.comportamentale.Strategy.problema1;

public class Main {
    public static void main(String[] args) {
        IModalitatePlata plataCard = new PlataCard();
        IModalitatePlata plataCash = new PlataCash();

        Achizitie achizitie1 = new Achizitie(453);
        achizitie1.setModalitatePlata(plataCard);
        achizitie1.achizitioneaza();

        Achizitie achizitie2 = new Achizitie(34);
        achizitie2.setModalitatePlata(plataCash);
        achizitie2.achizitioneaza();
    }
}
