package CTS.practice.teste.categoria1.test_factory_singleton_main;

import CTS.practice.teste.categoria1.test_factory_singleton.*;

public class Main {
    public static void main(String[] args) {
        IFactoryProdus factoryProdus = new FactoryProdusMarketing();

        Produs flyer1 = factoryProdus.getProdus(TipProdus.Flyer,"G","IT",120,150);
        Produs poster1 = factoryProdus.getProdus(TipProdus.Poster,"R","MARKETING",34,45);
        Produs sticker1 = factoryProdus.getProdus(TipProdus.Sticker,"S","GAMING",5,10);
        Produs sticker2 = factoryProdus.getProdus(TipProdus.Sticker,"R","TRICOTAJE",3,6);

        System.out.println(flyer1);
        System.out.println(poster1);
        System.out.println(sticker1);
        System.out.println(sticker2);

        Produs banner1 = factoryProdus.getProdus(TipProdus.Banner, "A", "IT",45,45);
        Produs banner2 = factoryProdus.getProdus(TipProdus.Banner, "X", "AVIATIE",400,400);
        System.out.println(banner1);
        System.out.println(banner2);


        // arunca eroarea aven deja banner creat pentru acel domeniu
        Produs banner3 = factoryProdus.getProdus(TipProdus.Banner, "FD", "IT", 56,67);
        System.out.println(banner3);

        System.out.println("END OF PROGRAM");
    }
}
