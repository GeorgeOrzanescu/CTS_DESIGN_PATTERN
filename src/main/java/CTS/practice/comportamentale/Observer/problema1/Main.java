package CTS.practice.comportamentale.Observer.problema1;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("G");
        Pacient pacient2 = new Pacient("T");
        Pacient pacient3 = new Pacient("S");

        Spital pantelimon = new Spital();

        pantelimon.abonarePacient(pacient1);
        pantelimon.abonarePacient(pacient2);
        pantelimon.abonarePacient(pacient3);
        pantelimon.abonarePacient(pacient3); // because it's a set we don't store duplicates

        pantelimon.notificaPacienti("Rubeola in perioada urmatoare!");

        pantelimon.dezabonarePacient(pacient3);
        pantelimon.notificaPacienti("Rujeola in perioada urmatoare");
    }
}
