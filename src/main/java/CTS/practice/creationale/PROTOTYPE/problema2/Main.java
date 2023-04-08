package CTS.practice.creationale.PROTOTYPE.problema2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> reteta1 = new ArrayList<>();
        reteta1.add("Nurofen");
        reteta1.add("Paracetamol");

        RetetaMedicament retetaMedicament1 = new RetetaMedicament(reteta1);
        retetaMedicament1.descriere();

        RetetaMedicament clonaRetetaMedicament1 = (RetetaMedicament) retetaMedicament1.clone();
        clonaRetetaMedicament1.descriere();

        clonaRetetaMedicament1.addMedicament("Deplasil");
        retetaMedicament1.descriere();

    }
}
