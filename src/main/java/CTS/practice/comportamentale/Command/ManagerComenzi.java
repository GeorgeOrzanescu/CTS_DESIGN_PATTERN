package CTS.practice.comportamentale.Command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<IComanda> listaComenzi;

    public ManagerComenzi() {
        this.listaComenzi = new ArrayList<>();
    }

    public void invoke(IComanda comanda) {
        this.listaComenzi.add(comanda);
    }

    public void execute() {
        this.listaComenzi.get(0).executa();
        this.listaComenzi.remove(0);
    }
}
