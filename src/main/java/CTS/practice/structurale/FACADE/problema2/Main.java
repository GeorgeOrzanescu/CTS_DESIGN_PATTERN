package CTS.practice.structurale.FACADE.problema2;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan("G",12);
        Fan fan2= new Fan("S",134);
        Fan fan3 = new Fan("D",32);

        ApiStadioane apiStadioane = new ApiStadioane();
        apiStadioane.adaugaFan(fan1);
        apiStadioane.adaugaFan(fan2);
        apiStadioane.adaugaFan(fan3);
        ApiPolitie apiPolitie = new ApiPolitie();

        AccesStadionFacade accesStadionFacade = new AccesStadionFacade(apiPolitie,apiStadioane);

        accesStadionFacade.accesStadion("R",121);
        accesStadionFacade.accesStadion("G",12);
    }
}
