package CTS.practice.comportamentale.Strategy.problema2;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();


        banca.setStrategie(new StrategiePF());

        banca.verificareActe();

        banca.setStrategie(new StrategiePJ());

        banca.verificareActe();
    }
}
