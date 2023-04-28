package CTS.practice.teste.categoria1.test_builder_factory;

public class TrekkerBicicleta extends Bicicleta{
    public TrekkerBicicleta(float diametru, String tipFrana, boolean areCasca, boolean areOchelari) {
        super(diametru, tipFrana, areCasca, areOchelari);
    }


    @Override
    public String toString() {
        return "TREKEKR : " + super.toString();
    }
}
