package CTS.practice.creationale.FACTORY.problema5;

public class Main {
    public static void main(String[] args) {
        IFactory factoryClientJuridic = new FactoryClientJuridic();
        IFactory factoryClientFizic = new FactoryClientFizic();

        ClientJuridic clientJuridic = (ClientJuridic) factoryClientJuridic.getClientBanca();
        ClientFizic clientFizic = (ClientFizic) factoryClientFizic.getClientBanca();

        clientJuridic.descriere();
        clientFizic.descriere();
    }
}
