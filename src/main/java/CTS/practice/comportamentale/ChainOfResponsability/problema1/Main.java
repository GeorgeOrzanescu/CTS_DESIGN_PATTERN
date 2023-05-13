package CTS.practice.comportamentale.ChainOfResponsability.problema1;

public class Main {
    public static void main(String[] args) {
        ContBanca contBanca1 = new ContBanca(400);
        ContBanca contBanca2 = new ContBanca(500);
        ContBanca contBanca3 = new ContBanca(600);

        contBanca1.setNextHandler(contBanca2);
        contBanca2.setNextHandler(contBanca3);
        contBanca3.setNextHandler(null);


        contBanca1.gestioneazaPlata(589);
        contBanca1.gestioneazaPlata(300);
        contBanca1.gestioneazaPlata(400);
        contBanca1.gestioneazaPlata(55);

    }
}
