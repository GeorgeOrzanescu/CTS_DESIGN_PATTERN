package CTS.practice.structurale.FLYWEIGHT.problema2;

public class ContBanca implements ICont{
    private int nrInregistrare;
    private String valuta;
    private int depozitInitial;

    public ContBanca(int nrInregistrare, String valuta, int depozitInitial) {
        this.nrInregistrare = nrInregistrare;
        this.valuta = valuta;
        this.depozitInitial = depozitInitial;
    }

    @Override
    public void descriereCont(Client client) {
        System.out.println(this);
        System.out.println(client);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBanca{");
        sb.append("nrInregistrare=").append(nrInregistrare);
        sb.append(", valuta='").append(valuta).append('\'');
        sb.append(", depozitInitial=").append(depozitInitial);
        sb.append('}');
        return sb.toString();
    }
}
