package CTS.practice.creationale.BUILDER.problema4;

public class BuilderContBancar implements IBuilder {

    private ContBancar contBancar;

    public BuilderContBancar() {
        this.contBancar = new ContBancar(false, false, false);

    }

    public BuilderContBancar adaugaInternetBanking(boolean adaugaInternetBanking) {
        this.contBancar.setInternetBanking(adaugaInternetBanking);
        return this;
    }

    public BuilderContBancar adaugaCardAtasat(boolean adaugaCardAtasat) {
        this.contBancar.setCardAtasat(adaugaCardAtasat);
        return this;
    }

    public BuilderContBancar adaugaContSalariu(boolean adaugaContSalariu) {
        this.contBancar.setContSalariu(adaugaContSalariu);
        return this;
    }

    @Override
    public ContBancar build() {
        return this.contBancar;
    }

}
