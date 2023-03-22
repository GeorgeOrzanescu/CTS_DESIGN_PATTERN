package CTS.practice.creationale.BUILDER.problema2;

public class Rezervare {
    private Boolean asezareGeam;
    private Boolean scaunErgonomic;
    private Boolean masaDecorata;
    private Boolean masaAmbientala;
    private Boolean muzica;

    public Rezervare() {
        this.asezareGeam = false;
        this.masaAmbientala = false;
        this.masaDecorata = false;
        this.muzica = false;
        this.scaunErgonomic = false;
    }

    public Rezervare(Boolean asezareGeam, Boolean masaAmbientala, Boolean masaDecorata, Boolean muzica,
            Boolean scaunErgonomic) {
        this.asezareGeam = asezareGeam;
        this.masaAmbientala = masaAmbientala;
        this.masaDecorata = masaDecorata;
        this.muzica = muzica;
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScaunErgonomic(Boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setMasaDecorata(Boolean masaDecorata) {
        this.masaDecorata = masaDecorata;
    }

    public void setMasaAmbientala(Boolean masaAmbientala) {
        this.masaAmbientala = masaAmbientala;
    }

    public void setMuzica(Boolean muzica) {
        this.muzica = muzica;
    }

    @Override
    public String toString() {
        return "Rezervare [asezareGeam=" + asezareGeam + ", scaunErgonomic=" + scaunErgonomic + ", masaDecorata="
                + masaDecorata + ", masaAmbientala=" + masaAmbientala + ", muzica=" + muzica + "]";
    }

}
