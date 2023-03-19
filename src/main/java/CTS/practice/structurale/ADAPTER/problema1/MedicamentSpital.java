package CTS.practice.ADAPTER.problema1;

public class MedicamentSpital {
    private String nume;

    public MedicamentSpital(String nume) {
        this.nume = nume;
    }

    public void achizitioneazaMedicament() {
        this.prezintaReteta();
        System.out.println("Medicamentul a fost achizitionat");
    }

    public void prezintaReteta() {
        System.out.println("Clientul prezinta reteta");
    }
}
