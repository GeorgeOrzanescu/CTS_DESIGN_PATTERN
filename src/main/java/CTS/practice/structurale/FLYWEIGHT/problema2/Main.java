package CTS.practice.structurale.FLYWEIGHT.problema2;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("G","32232132");
        Client client2 = new Client("S","332132132");
        Client client3= new Client("R","4334343");

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        ContBanca contBanca1  = flyweightFactory.getBanca(12, "US DOLARS", 100);
        ContBanca contBanca2  = flyweightFactory.getBanca(32, "EURO", 56);

        contBanca1.descriereCont(client1);
        contBanca2.descriereCont(client1);
        contBanca1.descriereCont(client2);
    }
}
