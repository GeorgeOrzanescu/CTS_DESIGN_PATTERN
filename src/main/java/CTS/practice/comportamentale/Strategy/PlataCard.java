package CTS.practice.comportamentale.Strategy;

public class PlataCard implements IModalitatePlata {

    @Override
    public void plateste() {
        System.out.println("Plata sa efectuat cu cardul");
    }

}
