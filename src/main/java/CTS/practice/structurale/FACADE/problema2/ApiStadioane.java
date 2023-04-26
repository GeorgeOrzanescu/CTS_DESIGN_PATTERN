package CTS.practice.structurale.FACADE.problema2;

import java.util.ArrayList;
import java.util.Objects;

public class ApiStadioane {
    ArrayList<Fan> fani = new ArrayList<Fan>();

    public void adaugaFan(Fan fan) {
        this.fani.add(fan);
    }

    public boolean verificareAntecedenteStadioane(String nume) {
        return this.fani.stream().anyMatch(fan -> Objects.equals(fan.getNume(), nume));
    }

    public boolean verificareBilet() {
        return Math.random() < 0.2;
    }
}
