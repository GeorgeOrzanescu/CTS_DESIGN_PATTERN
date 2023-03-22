package CTS.practice.creationale.BUILDER.problema2;

public class Main {

    public static void main(String[] args) {

        Rezervare rez1 = new Rezervare(false, true, false, true, false);
        System.out.println(rez1);

        Rezervare re2 = new Rezervare();
        re2.setAsezareGeam(true);
        re2.setMuzica(true);

        System.out.println(re2);

        Rezervare buildRez = new RezervareBuilder().addAsezareGeam(true).addMuzica(true).build();

        System.out.println(buildRez);
    }
}
