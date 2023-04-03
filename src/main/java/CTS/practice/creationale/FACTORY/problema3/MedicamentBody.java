package CTS.practice.creationale.FACTORY.problema3;

public class MedicamentBody extends Medicament {
    public MedicamentBody(int pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentBody{");
        sb.append("pret=").append(pret);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
