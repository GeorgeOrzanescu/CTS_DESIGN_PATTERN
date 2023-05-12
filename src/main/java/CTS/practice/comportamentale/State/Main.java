package CTS.practice.comportamentale.State;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(1000);


        bancomat.introducereCard();

        bancomat.introducerePin();

        bancomat.retragereBani(100);

        bancomat.introducereCard();
    }
}
