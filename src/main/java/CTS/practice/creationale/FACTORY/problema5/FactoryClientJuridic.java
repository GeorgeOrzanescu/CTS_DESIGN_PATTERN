package CTS.practice.creationale.FACTORY.problema5;

public class FactoryClientJuridic implements IFactory {

    @Override
    public IClientBanca getClientBanca() {
        return new ClientJuridic();
    }

}
