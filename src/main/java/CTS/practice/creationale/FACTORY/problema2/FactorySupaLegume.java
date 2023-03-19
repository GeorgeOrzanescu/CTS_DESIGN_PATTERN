package CTS.practice.creationale.FACTORY.problema2;

public class FactorySupaLegume implements FactorySupa {

    @Override
    public ISupa preparaSupa() {
        return new SupaLegume();
    }

}
