package CTS.practice.structurale.PROXY.problema1;

public class Pacient implements IPacient{

    private Boolean asigurareSanatate;

    public Pacient(Boolean asigurareSanatate) {
        this.asigurareSanatate = asigurareSanatate;
    }

    public Boolean getAsigurareSanatate() {
        return asigurareSanatate;
    }

    public void setAsigurareSanatate(Boolean asigurareSanatate) {
        this.asigurareSanatate = asigurareSanatate;
    }

    @Override
    public void descriere() {
        this.toString();
    }

    @Override
    public void solicitaInternare() {
        System.out.println("Solicit internare");
        System.out.println("Internare acceptata!");
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "asigurareSanatate=" + asigurareSanatate +
                '}';
    }
}
