package CTS.practice.teste.categoria1.test_factory_singleton;

public interface IFactoryProdus {
    Produs getProdus(TipProdus tipProdus, String numeClient, String domeniuActivitate, int latime, int inaltime);
}
