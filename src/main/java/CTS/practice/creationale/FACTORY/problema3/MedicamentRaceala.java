package CTS.practice.creationale.FACTORY.problema3;

public class MedicamentRaceala extends Medicament{

    public MedicamentRaceala(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentRaceala{");
        sb.append("pret=").append(pret);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
