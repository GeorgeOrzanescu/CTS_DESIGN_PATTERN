package CTS.practice.comportamentale.State.problema2;

public class LocOcupat implements IStareLoc{
    @Override
    public void rezervaLoc(Tribuna tribuna, int nrLoc) {
        System.out.println("Locul este ocupat si nu poate fi rezervat");
    }
}
