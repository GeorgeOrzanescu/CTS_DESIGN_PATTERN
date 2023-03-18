package CTS.practice.ADAPTER.problema1;

public class AdapterMedicament implements IMedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdapterMedicament(String numeMedicament) {
        this.medicamentSpital = new MedicamentSpital(numeMedicament);
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }

}
