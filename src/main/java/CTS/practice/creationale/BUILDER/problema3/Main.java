package CTS.practice.creationale.BUILDER.problema3;

public class Main {
    public static void main(String[] args) {
        Factura f1 = new FacturaBuilder().setNumarPungi(3).setPlatitorTVA(true).build();
        Factura f2= new FacturaBuilder().setNumarPungi(1).setCardFidelitate(true).build();
        System.out.println(f1);
        System.out.println(f2);
    }
}
