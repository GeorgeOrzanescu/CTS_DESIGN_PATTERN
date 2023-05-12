package CTS.practice.structurale.DECORATOR.problema2;

public class DecoratorPlataContactLess extends PlataDecorata {

    public DecoratorPlataContactLess(IPlataCard plataCard) {
        super(plataCard);
    }

    @Override
    public void plataContactLess() {
        System.out.println("Plata ContactLess");
    }
}
