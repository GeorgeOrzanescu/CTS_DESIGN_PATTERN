package CTS.practice.comportamentale.Observer.problema1;

public class Pacient implements IAnuntMedical {
    private String numePacient;

    public Pacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Pacientul " + this + " a primit notificarea: " + mesaj);
    }

    public String getNumePacient() {
        return numePacient;
    }

    @Override
    public String toString() {
        return numePacient;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

}
