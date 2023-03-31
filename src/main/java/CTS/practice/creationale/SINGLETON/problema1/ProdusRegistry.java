package CTS.practice.creationale.SINGLETON.problema1;

import java.util.HashMap;

public class ProdusRegistry {
    private static HashMap<Integer, Produs> produse = new HashMap<>();

    public ProdusRegistry() {
    }

    public static void registerProdus(Produs produs) throws Exception {
        if (produse.get(produs.getId()) != null) {
            throw new Exception("Produsul exista deja");
        }
        produse.put(produs.getId(), produs);
    }

    public static Produs getProdus(Integer id) {
        return produse.get(id);
    }

}
