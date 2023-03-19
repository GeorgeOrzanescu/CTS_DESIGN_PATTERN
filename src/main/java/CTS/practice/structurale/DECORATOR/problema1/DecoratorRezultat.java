package CTS.practice.structurale.DECORATOR.problema1;

public abstract class DecoratorRezultat implements IRezultat{

    private IRezultat rezultat;

    public DecoratorRezultat(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    public abstract void obtinereRezultatOnline();
}
