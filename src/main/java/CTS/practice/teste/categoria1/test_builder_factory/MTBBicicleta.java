package CTS.practice.teste.categoria1.test_builder_factory;

public class MTBBicicleta extends Bicicleta{
    public MTBBicicleta(float diametru, String tipFrana, boolean areCasca, boolean areOchelari) {
        super(diametru, tipFrana, areCasca, areOchelari);
    }


    @Override
    public String toString() {
        return "MTB : " + super.toString();
    }
}
