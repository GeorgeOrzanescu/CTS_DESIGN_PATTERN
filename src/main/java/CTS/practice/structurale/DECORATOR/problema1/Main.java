package CTS.practice.structurale.DECORATOR.problema1;

public class Main {
    public static void main(String[] args) {

        Rezultat rezultatPrintat = new Rezultat();
        rezultatPrintat.obtinereRezultat();

        DecoratorRezultat rezultatOnline = new RezultatDecorat(rezultatPrintat);

        rezultatOnline.obtinereRezultatOnline();
    }
}