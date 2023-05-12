package CTS.practice.comportamentale.Command;

public class Retragere implements IComanda{
    private Cont cont;
    private int suma;


    public Retragere(Cont cont,int suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void executa() {
        this.cont.setSold(this.cont.getSold() - this.suma);
        System.out.println("Retragere");
    }
}
