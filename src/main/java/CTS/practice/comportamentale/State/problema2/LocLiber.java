package CTS.practice.comportamentale.State.problema2;

public class LocLiber implements IStareLoc {
    @Override
    public void rezervaLoc(Tribuna tribuna, int nrLoc) {
        tribuna.getLocuri().add(nrLoc, new LocRezervat());
        System.out.println("Loc nr: " + nrLoc + " rezervat!");
    }
}
