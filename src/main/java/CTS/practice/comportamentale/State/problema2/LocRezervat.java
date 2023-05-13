package CTS.practice.comportamentale.State.problema2;

public class LocRezervat implements IStareLoc {
    @Override
    public void rezervaLoc(Tribuna tribuna, int nrLoc) {
        System.out.println("Exista deja o rezervare");
    }
}
