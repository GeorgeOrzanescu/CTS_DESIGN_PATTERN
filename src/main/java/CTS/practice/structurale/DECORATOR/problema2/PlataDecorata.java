package CTS.practice.structurale.DECORATOR.problema2;

public abstract class PlataDecorata {
    private IPlataCard plataCard;

    public PlataDecorata(IPlataCard plataCard) {
        this.plataCard = plataCard;
    }

    public abstract void plataContactLess();

    public void plataOnline() {
        this.plataCard.plataOnline();
    }

    public void plataNormala() {
        this.plataCard.plataNormala();
    }
}
