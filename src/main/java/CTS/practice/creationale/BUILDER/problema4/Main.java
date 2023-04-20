package CTS.practice.creationale.BUILDER.problema4;

public class Main {
    public static void main(String[] args) {
        BuilderContBancar builder = new BuilderContBancar();

        ContBancar cont1 = builder.adaugaCardAtasat(true).adaugaInternetBanking(true).build();

        System.out.println(cont1);
    }
}
