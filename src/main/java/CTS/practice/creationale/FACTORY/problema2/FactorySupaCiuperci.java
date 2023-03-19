package CTS.practice.creationale.FACTORY.problema2;

public class FactorySupaCiuperci implements FactorySupa {

    @Override
    public ISupa preparaSupa() {
        return new SupaCiuperci();
    }

}
