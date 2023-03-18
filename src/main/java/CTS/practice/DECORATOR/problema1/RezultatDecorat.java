package CTS.practice.DECORATOR.problema1;

public class RezultatDecorat extends DecoratorRezultat{
    public RezultatDecorat(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void obtinereRezultatOnline() {
        System.out.println("Rezultat obtinut Online!");
    }

    @Override
    public void obtinereRezultat() {
        this.obtinereRezultatOnline();
    }
}
