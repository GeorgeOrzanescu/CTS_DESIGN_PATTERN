package CTS.practice.structurale.FACADE.problema2;

public class AccesStadionFacade {
    private ApiPolitie apiPolitie;
    private ApiStadioane apiStadioane;


    public AccesStadionFacade(ApiPolitie apiPolitie, ApiStadioane apiStadioane) {
        this.apiPolitie = apiPolitie;
        this.apiStadioane = apiStadioane;
    }

    public void accesStadion(String nume, int cnp) {
        boolean identitateValida = this.apiPolitie.validareIdentitateBuletin();
        boolean antecendete = this.apiStadioane.verificareAntecedenteStadioane(nume);
        boolean biletValid = this.apiStadioane.verificareBilet();

        if(identitateValida || antecendete || biletValid) {
            System.out.println("Access interzis pe stadion");
        }
        else{
            System.out.println("Bine ati venit la meci");
        }
    }
}
