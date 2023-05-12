package CTS.practice.structurale.DECORATOR.problema2;

public class Main {
    public static void main(String[] args) {
        PlataCard plataCard = new PlataCard();

        plataCard.plataNormala();
        plataCard.plataOnline();

        PlataDecorata plataContactless = new DecoratorPlataContactLess(plataCard);

        plataContactless.plataNormala();
        plataContactless.plataOnline();
        plataContactless.plataContactLess();
    }
}
