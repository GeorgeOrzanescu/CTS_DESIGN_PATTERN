package CTS.practice.creationale.SINGLETON.problema1;

public class Main {
    public static void main(String[] args) {
        Produs carte1 = new Carte(42);
        Produs carte2 = new Carte(48);
        Produs haina1 = new Haina(103);

        try {
            ProdusRegistry.registerProdus(haina1);
            ProdusRegistry.registerProdus(carte1);
            ProdusRegistry.registerProdus(carte2);

            System.out.println(ProdusRegistry.getProdus(42));
            System.out.println(ProdusRegistry.getProdus(48));
            System.out.println(ProdusRegistry.getProdus(103));

            ProdusRegistry.registerProdus(haina1);

            System.out.println(ProdusRegistry.getProdus(2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
