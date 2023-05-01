package CTS.practice.teste.categoria1.test_prototype_factory_main;

import CTS.practice.teste.categoria1.test_prototype_factory.Banner;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("T",11,12,"BUC");
        System.out.println(banner);

        try {
            Banner copie1 = (Banner) banner.copiaza();
            Banner copie2 = (Banner) banner.copiaza();
            Banner copie3 = (Banner) banner.copiaza();
            Banner copie4 = (Banner) banner.copiaza();


            System.out.println(copie1);
            System.out.println(copie2);
            System.out.println(copie3);
            System.out.println(copie4);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
