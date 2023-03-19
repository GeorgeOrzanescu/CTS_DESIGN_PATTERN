package CTS.practice.structurale.PROXY.problema1;

public class ProxyPacient implements IPacient {

    private Pacient pacient;

    public ProxyPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void descriere() {
        this.toString();
    }

    @Override
    public void solicitaInternare() {
        if (pacient.getAsigurareSanatate()) {
            pacient.solicitaInternare();
        } else {
            System.out.println("Internare refuzata - lipsa asigurare medicala!");
        }
    }

    @Override
    public String toString() {
        return "ProxyPacient{" +
                "pacient=" + pacient.toString() +
                '}';
    }
}
