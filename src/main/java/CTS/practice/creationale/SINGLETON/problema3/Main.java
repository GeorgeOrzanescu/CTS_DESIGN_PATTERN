package CTS.practice.creationale.SINGLETON.problema3;

public class Main {
    public static void main(String[] args) {
        ConfigAplicatie configAplicatie = ConfigAplicatie.getInstance();

        configAplicatie.setNumarThreaduri(3);
        configAplicatie.setTipMediuDezvoltare(TipMediuDezvoltare.dev);

        System.out.println(configAplicatie);


        ConfigAplicatie configAplicatieNoua = ConfigAplicatie.getInstance();

        System.out.println(configAplicatie);
    }
}
