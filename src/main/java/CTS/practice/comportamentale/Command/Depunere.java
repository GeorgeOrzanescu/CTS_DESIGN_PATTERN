package CTS.practice.comportamentale.Command;

public class Depunere implements IComanda{
    private Cont cont;
    private int suma;

    public Depunere(Cont cont, int suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void executa() {
        this.cont.depunere(this.suma);
    }
}
