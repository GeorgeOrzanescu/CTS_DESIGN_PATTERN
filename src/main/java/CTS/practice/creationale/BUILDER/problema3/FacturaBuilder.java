package CTS.practice.creationale.BUILDER.problema3;

public class FacturaBuilder implements IBuilder {
    private Factura factura;

    FacturaBuilder(){
        this.factura = new Factura(0,TipPlata.PLATA_CASH,false,false,0);
    }

    @Override
    public Factura build() {
        return this.factura;
    }

    public FacturaBuilder setNumarPungi(int numarPungi){
        this.factura.setNumarPungi(numarPungi);
        return this;
    }

    public FacturaBuilder setTipPlata(TipPlata tipPlata) {
        this.factura.setTipPlata(tipPlata);
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public FacturaBuilder setPlatitorTVA(boolean platitorTVA){
        this.factura.setPlatitorTVA(platitorTVA);
        if(this.factura.platitorTVA){
            this.factura.cotaTVA = 19;
        }
        else{
            this.factura.cotaTVA = 0;
        }
        return this;
    }
}
