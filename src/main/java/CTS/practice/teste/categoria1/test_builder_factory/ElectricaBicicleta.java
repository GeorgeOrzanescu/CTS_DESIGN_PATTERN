package CTS.practice.teste.categoria1.test_builder_factory;

public class ElectricaBicicleta extends Bicicleta {

    public ElectricaBicicleta(float diametru, String tipFrana, boolean areCasca, boolean areOchelari) {
        super(diametru, tipFrana, areCasca, areOchelari);
    }


    @Override
    public String toString() {
        return "ELECTRICA : " + super.toString();
    }
}
