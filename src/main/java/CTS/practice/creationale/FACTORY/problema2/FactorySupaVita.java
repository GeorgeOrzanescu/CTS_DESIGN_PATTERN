package CTS.practice.creationale.FACTORY.problema2;

public class FactorySupaVita implements FactorySupa {

    @Override
    public ISupa preparaSupa() {
        return new SupaVita();
    }

}
