package CTS.practice.structurale.FLYWEIGHT.problema1;

public class Main {
    public static void main(String[] args) {
        DateInternare date1 = new DateInternare(13, 2, 3);
        DateInternare date2 = new DateInternare(4, 41, 5);
        DateInternare date3 = new DateInternare(11, 3, 3);

        Internare internat1 = new Internare("G", "7564784", "Buc");
        Internare internat2 = new Internare("F", "454434", "Ilfov");
        Internare internat3 = new Internare("R", "75364784", "Suceava");

        internat1.descriere(date1);
        internat2.descriere(date2);
        internat3.descriere(date3);

        FabricaInternari fabrica = new FabricaInternari();
        fabrica.getInternare("G", "7564784", "Buc").descriere(date1);
        fabrica.getInternare("F", "999999", "Buzay").descriere(date3);

    }
}
