package CTS.practice.structurale.ADAPTER.problema1;

public class Main {

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        MedicamentSpital medicamentSpital = new MedicamentSpital("Sporasin");

        medicamentFarmacie.cumparaMedicament();
        medicamentSpital.achizitioneazaMedicament();

        AdapterMedicament medicamentFAdaptat = new AdapterMedicament("Sporasin");

        medicamentFAdaptat.cumparaMedicament();
    }
}
