package CTS.practice.creationale.BUILDER.problema3;

public class Factura {
    int numarPungi;
    TipPlata tipPlata;
    Boolean cardFidelitate;
    Boolean platitorTVA;
    int cotaTVA;

    public Factura(int numarPungi, TipPlata tipPlata, Boolean cardFidelitate, Boolean platitorTVA, int cotaTVA) {
        this.numarPungi = numarPungi;
        this.tipPlata = tipPlata;
        this.cardFidelitate = cardFidelitate;
        this.platitorTVA = platitorTVA;
        this.cotaTVA = cotaTVA;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setTipPlata(TipPlata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void setCardFidelitate(Boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setPlatitorTVA(Boolean platitorTVA) {
        this.platitorTVA = platitorTVA;
    }

    public void setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numarPungi=" + numarPungi +
                ", tipPlata=" + tipPlata +
                ", cardFidelitate=" + cardFidelitate +
                ", platitorTVA=" + platitorTVA +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
}
