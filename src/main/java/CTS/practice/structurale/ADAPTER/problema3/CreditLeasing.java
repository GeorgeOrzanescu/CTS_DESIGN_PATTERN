package CTS.practice.structurale.ADAPTER.problema3;

public class CreditLeasing {
    private int nrRate;

    public void setNrRate(int nrRate) {
        this.nrRate = nrRate;
    }

    public boolean verificaEligibilitate(int salariu) {
        return salariu/nrRate > 500;
    }
}
