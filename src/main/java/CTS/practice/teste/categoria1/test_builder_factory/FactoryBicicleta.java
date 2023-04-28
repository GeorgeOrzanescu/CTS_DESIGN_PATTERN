package CTS.practice.teste.categoria1.test_builder_factory;

public class FactoryBicicleta implements IFactoryBicicleta{
    @Override
    public Bicicleta getBicicleta(TipBicicleta tipBicicleta, float diametru, String tipFrana, boolean areCasca, boolean areOchelari) {
        switch (tipBicicleta) {
            case ELECTRICA: return new ElectricaBicicleta(diametru,tipFrana,areCasca,areOchelari);
            case MTB: return new MTBBicicleta(diametru,tipFrana,areCasca,areOchelari);
            case TREKKER: return new TrekkerBicicleta(diametru,tipFrana,areCasca,areOchelari);
            default: return null;
        }
    }
}
