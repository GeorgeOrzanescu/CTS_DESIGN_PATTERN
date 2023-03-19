package CTS.practice.structurale.FACADE.problema1;

import java.util.ArrayList;

public class Salon {

    ArrayList<Integer> paturiLibere = new ArrayList<>();

    Salon() {
        for (int i = 0; i < 35; i = i + 2) {
            paturiLibere.add(i);
        }
    }

    public Boolean patDisponibil(Integer numarPat) {
        return paturiLibere.contains(numarPat);
    }
}
