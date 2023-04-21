package CTS.practice.teste.categoria1.test_factory_singleton;

public class FactoryProdusMarketing implements IFactoryProdus {
    private ProdusRegistry produsRegistry;

    public FactoryProdusMarketing() {
        produsRegistry = ProdusRegistry.getProdusRegistryInstance();
    }

    @Override
    public Produs getProdus(TipProdus tipProdus, String numeClient, String domeniuActivitate, int latime, int inaltime) {
        switch (tipProdus) {
            case Flyer:
                return new Flyer(numeClient, domeniuActivitate, latime, inaltime);
            case Poster:
                return new Poster(numeClient, domeniuActivitate, latime, inaltime);
            case Sticker:
                return new Sticker(numeClient, domeniuActivitate, latime, inaltime);
            case Banner: {
                try {
                    Produs banner = new Sticker(numeClient, domeniuActivitate, latime, inaltime);
                    this.produsRegistry.addProdus(banner);
                    return banner;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            default:
                return null;
        }
    }
}
