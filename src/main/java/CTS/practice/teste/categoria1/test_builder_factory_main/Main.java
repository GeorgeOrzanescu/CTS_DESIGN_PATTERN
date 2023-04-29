package CTS.practice.teste.categoria1.test_builder_factory_main;

import CTS.practice.teste.categoria1.test_builder_factory.*;

public class Main {
    public static void main(String[] args) {
        BuilderBicicleta builderBicicleta = new BuilderBicicleta();

        Bicicleta bicicleta1 = (Bicicleta) builderBicicleta.seteazaOchelari(true).seteazaDiametruRoti(30).build();
        bicicleta1.afiseazaBicicleta();

        Bicicleta bicicleta2 = (Bicicleta) builderBicicleta.build();
        Bicicleta bicicleta3 = (Bicicleta) builderBicicleta.seteazaCascaProtectie(true).build();
        Bicicleta bicicleta4 = (Bicicleta) builderBicicleta.seteazaTipFrana("disc").build();
        bicicleta2.afiseazaBicicleta();
        bicicleta3.afiseazaBicicleta();
        bicicleta4.afiseazaBicicleta();


        IFactoryBicicleta factoryBicicleta = new FactoryBicicleta();

        MTBBicicleta mtbBicicleta = (MTBBicicleta) factoryBicicleta.getBicicleta(TipBicicleta.MTB,23,"shimano",true,true);
        ElectricaBicicleta electricaBicicleta = (ElectricaBicicleta) factoryBicicleta.getBicicleta(TipBicicleta.ELECTRICA,32,"ARS",false,true);
        TrekkerBicicleta trekkerBicicleta = (TrekkerBicicleta) factoryBicicleta.getBicicleta(TipBicicleta.TREKKER,32,"REL",true,false);

//        bicicleta1.setTipFrana("gf");

        mtbBicicleta.afiseazaBicicleta();
        electricaBicicleta.afiseazaBicicleta();
        trekkerBicicleta.afiseazaBicicleta();
    }
}
