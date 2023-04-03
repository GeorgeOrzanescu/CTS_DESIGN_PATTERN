package CTS.practice.creationale.FACTORY.problema3;

public class Main {

    public static void main(String[] args) {

        MedicamentFactory medFactory = new MedicamentFactory();
        try {
            Medicament medDurere = medFactory.getMedicament(TipMedicament.DURERE,2,"algocalmin");
            Medicament medBody = medFactory.getMedicament(TipMedicament.BODY,3,"duracell");
            Medicament medRaceala= medFactory.getMedicament(TipMedicament.RACEALA,12,"paracetamol");
            medDurere.descriere();
            medRaceala.descriere();
            medBody.descriere();
//            MedicamentDurere medicamentDurere = medFactory.getMedicament(TipMedicament.STRES,43,"falaf");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
