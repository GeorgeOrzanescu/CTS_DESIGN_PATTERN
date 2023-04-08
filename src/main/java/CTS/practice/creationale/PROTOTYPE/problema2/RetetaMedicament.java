package CTS.practice.creationale.PROTOTYPE.problema2;

import java.util.ArrayList;

public class RetetaMedicament implements IRetetaPrototype{

    private ArrayList<String> medicamente;

    public RetetaMedicament(ArrayList<String> medicamente) {
        this.medicamente = medicamente;
    }

    public void descriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "medicamente=" + medicamente +
                '}';
    }

    public ArrayList<String> getMedicamente() {
        return medicamente;
    }

    public void addMedicament(String medicament) {
        if(!this.medicamente.contains(medicament)) {
            this.medicamente.add(medicament);
        }
    }

    @Override
    public IRetetaPrototype clone() {
        try {
            RetetaMedicament clona = (RetetaMedicament) super.clone();
            return clona;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
