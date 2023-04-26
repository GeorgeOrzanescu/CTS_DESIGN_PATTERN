package CTS.practice.structurale.ADAPTER.problema2;

public class Main {
    public static void main(String[] args) {
        FirmaBilete firmaBilete = new FirmaBilete();
        EBilet eBilet = new EBilet();

        firmaBilete.cumparaBilet();
        eBilet.vanzareBilet();

        AdapterEBilet adapterEBilet = new AdapterEBilet(firmaBilete);
        adapterEBilet.vanzareBilet();


    }
}
