package CTS.practice.structurale.FLYWEIGHT.problema1;

import java.util.HashMap;

public class FabricaInternari {
    private HashMap<String, IInternare> internari;

    public FabricaInternari() {
        this.internari = new HashMap<>();
    }

    public IInternare getInternare(String nume, String nrTelefon, String adresa) {
        IInternare internare = internari.get(nume);
        if (internare != null) {
            return internare;
        }
        internare = new Internare(nume, nrTelefon, adresa);
        internari.put(nume, internare);
        return internare;
    }

}
