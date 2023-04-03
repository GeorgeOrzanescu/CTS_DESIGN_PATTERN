package CTS.practice.creationale.FACTORY.problema3;

public class MedicamentFactory implements IFactory {
    @Override
    public Medicament getMedicament(TipMedicament tipMedicament, int id, String descriere) throws IllegalArgumentException {
        switch (tipMedicament) {
            case DURERE:
                return new MedicamentDurere(id, descriere);
            case BODY:
                return new MedicamentBody(id, descriere);
            case RACEALA:
                return new MedicamentRaceala(id, descriere);
            default:
                throw new IllegalArgumentException("Invalid tipMedicament: " + tipMedicament);
        }
    }
}

