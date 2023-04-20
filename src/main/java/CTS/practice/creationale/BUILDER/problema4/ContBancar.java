package CTS.practice.creationale.BUILDER.problema4;

public class ContBancar {
    private boolean cardAtasat;
    private boolean internetBanking;
    private boolean contSalariu;

    public ContBancar(boolean cardAtasat, boolean internetBanking, boolean contSalariu) {
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
        this.contSalariu = contSalariu;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public boolean isContSalariu() {
        return contSalariu;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    @Override
    public String toString() {
        return "ContBancar [cardAtasat=" + cardAtasat + ", internetBanking=" + internetBanking + ", contSalariu="
                + contSalariu + "]";
    }

}
