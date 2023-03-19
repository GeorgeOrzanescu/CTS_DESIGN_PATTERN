package CTS.practice.structurale.FACADE.problema1;

public class Main {
    public static void main(String[] args) {

        Medic medicORL = new Medic();
        System.out.println(medicORL.confirmaInternare());

        Salon salonInternari = new Salon();
        System.out.println(salonInternari.patDisponibil(4));

        InternareFacade interfataInternare = new InternareFacade();

        interfataInternare.internare(14);

    }
}