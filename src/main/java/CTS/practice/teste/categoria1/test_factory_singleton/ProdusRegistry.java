package CTS.practice.teste.categoria1.test_factory_singleton;

import java.util.HashMap;

public class ProdusRegistry {
    private HashMap <String,Produs> registruProduse;
    private static ProdusRegistry produsRegistry;
    private ProdusRegistry() {
        this.registruProduse = new HashMap<>();
    }

    public static synchronized ProdusRegistry getProdusRegistryInstance() {
        if(produsRegistry == null) {
            return new ProdusRegistry();
        }
        return produsRegistry;
    }

    public Produs getProdus(String domeniu) {
        Produs produs =  this.registruProduse.get(domeniu);
        if(produs != null) return produs;
        return null;
    }

    public void addProdus(Produs produs) throws Exception {
        Produs deVerificat = this.getProdus(produs.domeniuActivitate);
        if(deVerificat != null) {
            throw new Exception("Avem deje un produs creat pentru acest domeniu!");
        }
        this.registruProduse.put(produs.domeniuActivitate, produs);
    }
}
