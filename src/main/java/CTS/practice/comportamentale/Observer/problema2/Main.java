package CTS.practice.comportamentale.Observer.problema2;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();

        ClientBanca cl1 = new ClientBanca("D");
        ClientBanca cl2 = new ClientBanca("C");
        ClientBanca cl3 = new ClientBanca("G");

        banca.abonareClient(cl1);
        banca.abonareClient(cl2);
        banca.abonareClient(cl3);

        banca.adaugareOfertaCredit("Credit leasing 0 dobanda");
    }
}
