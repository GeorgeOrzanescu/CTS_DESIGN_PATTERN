package CTS.practice.comportamentale.Observer;

import java.util.HashSet;
import java.util.Set;

public class Spital {
    private Set<Pacient> pacienti;

    public Spital() {
        this.pacienti = new HashSet<>();
    }

    public void abonarePacient(Pacient pacient) {
        this.pacienti.add(pacient);
    }

    public void dezabonarePacient(Pacient pacient) {
        this.pacienti.remove(pacient);
    }

    public void notificaPacienti(String mesaj) {
        this.pacienti.forEach(pacient -> pacient.notificare(mesaj));
    }
}
