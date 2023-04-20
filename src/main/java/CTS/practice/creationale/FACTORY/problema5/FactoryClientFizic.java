package CTS.practice.creationale.FACTORY.problema5;

public class FactoryClientFizic implements IFactory {

    @Override
    public IClientBanca getClientBanca() {
        return new ClientFizic();
    }

}
