package CTS.practice.comportamentale.Strategy;

public class PlataCash implements IModalitatePlata {

    @Override
    public void plateste() {
        System.out.println("Plata sa efectuat cash");
    }

}
