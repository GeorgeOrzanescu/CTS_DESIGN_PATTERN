package CTS.practice.comportamentale.Command;

public class Cont {
    private int nr;
    private int sold;

    public Cont(int nr) {
        this.nr = nr;
        this.sold = 0;
    }


    protected int getSold() {
        return sold;
    }

    protected void setSold(int sold) {
        this.sold = sold;
    }

    public void constituire() {
        System.out.println("Contul a fost constituit");
    }

    public void depunere(int suma) {
        this.sold = this.sold + suma;
        System.out.println("Depus : " + suma);
    }
}
