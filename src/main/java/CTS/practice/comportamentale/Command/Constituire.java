package CTS.practice.comportamentale.Command;

public class Constituire implements IComanda{
    private Cont cont;

    public Constituire(Cont cont) {
        this.cont = cont;
    }

    @Override
    public void executa() {
        this.cont.constituire();
    }
}
