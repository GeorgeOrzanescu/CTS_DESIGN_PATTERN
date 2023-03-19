package CTS.practice.structurale.FACADE.problema1;

public class InternareFacade {
    public void internare(Integer numarPat) {
        Pacient pacient = new Pacient();
        Medic medic = new Medic();
        Salon salon = new Salon();

        pacient.gravitateBoala();

        Boolean confirmareInternare = medic.confirmaInternare();
        String messageInternare = confirmareInternare == true ? "Internare" : "Nu este necesara internarea";
        System.out.println(messageInternare);

        Boolean patDisponibil = salon.patDisponibil(numarPat);
        String messagePatDisponibil = patDisponibil ? "Disponibil" : "Indisponibil";
        System.out.println(messagePatDisponibil);

    }
}
