package CTS.practice.structurale.FACADE.problema1;

public class Pacient {

    public void gravitateBoala() {
        Double random = Math.random();

        if (random <= 0.5) {
            System.out.println("Grav");
        } else {
            System.out.println("Usor");
        }
    }
}
