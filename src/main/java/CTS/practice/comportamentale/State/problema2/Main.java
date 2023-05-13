package CTS.practice.comportamentale.State.problema2;

public class Main {
    public static void main(String[] args) {
        Tribuna tribuna1 = new Tribuna();

        IStareLoc loc1 = new LocLiber();
        IStareLoc loc2 = new LocLiber();
        IStareLoc loc3 = new LocLiber();
        IStareLoc loc4 = new LocOcupat();

        tribuna1.adaugaLoc(loc1);
        tribuna1.adaugaLoc(loc2);
        tribuna1.adaugaLoc(loc3);
        tribuna1.adaugaLoc(loc4);


        tribuna1.rezervaLoc(0);
        tribuna1.rezervaLoc(4);
    }
}
