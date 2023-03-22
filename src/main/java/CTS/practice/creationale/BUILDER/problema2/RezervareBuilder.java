package CTS.practice.creationale.BUILDER.problema2;

public class RezervareBuilder implements IBuilder {
    private Boolean asezareGeam;
    private Boolean scaunErgonomic;
    private Boolean masaDecorata;
    private Boolean masaAmbientala;
    private Boolean muzica;

    public RezervareBuilder() {
        this.asezareGeam = false;
        this.masaAmbientala = false;
        this.masaDecorata = false;
        this.muzica = false;
        this.scaunErgonomic = false;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(this.asezareGeam, this.masaAmbientala, this.masaDecorata, this.muzica,
                this.scaunErgonomic);
    }

    public RezervareBuilder addAsezareGeam(Boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilder addScaunErgonomomic(Boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilder addMasaDecorata(Boolean masaDecorata) {
        this.masaDecorata = masaDecorata;
        return this;
    }

    public RezervareBuilder addMasaAmbientala(Boolean masaAmbientala) {
        this.masaAmbientala = masaAmbientala;
        return this;
    }

    public RezervareBuilder addMuzica(Boolean muzica) {
        this.muzica = muzica;
        return this;
    }

}
