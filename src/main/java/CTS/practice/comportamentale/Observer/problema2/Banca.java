package CTS.practice.comportamentale.Observer.problema2;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IObservabil{

    private List<ClientBanca> listaClienti;
    private List<String> listaCredite;

    public Banca() {
        this.listaClienti = new ArrayList<>();
        this.listaCredite = new ArrayList<>();
    }

    public void abonareClient(ClientBanca client) {
        this.listaClienti.add(client);
    }

    public void dezabonareClient(ClientBanca client) {
        for (int i = 0; i < this.listaClienti.size(); i++) {
            if(this.listaClienti.get(i).getNume() == client.getNume()) {
                this.listaClienti.remove(i);
            }
        }
    }

    public void notificareClienti(String mesaj) {
        for (int i = 0; i < this.listaClienti.size(); i++) {
            this.listaClienti.get(i).notificare(mesaj);
        }
    }


    public void adaugareOfertaCredit(String ofertaCredit) {
        this.listaCredite.add(ofertaCredit);
        this.notificareClienti("Am lansat o noua oferta de credit : " + ofertaCredit);
    }

}
