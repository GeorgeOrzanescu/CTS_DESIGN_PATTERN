package CTS.practice.structurale.ADAPTER.problema2;

public class AdapterEBilet implements IPlatforma{
    private FirmaBilete firmaBilete;

    public AdapterEBilet(FirmaBilete firmaBilete) {
        this.firmaBilete = firmaBilete;
    }

    @Override
    public void vanzareBilet() {
        this.firmaBilete.rezervareBilet();
    }
}
