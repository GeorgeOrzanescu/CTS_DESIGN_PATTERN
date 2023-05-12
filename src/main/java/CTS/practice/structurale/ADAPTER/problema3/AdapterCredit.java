package CTS.practice.structurale.ADAPTER.problema3;

public class AdapterCredit extends CreditCurent  implements ICredit {
    private CreditLeasing creditLeasing;

    public AdapterCredit(CreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public boolean aprobaCredit() {
        this.creditAprobat = this.creditLeasing.verificaEligibilitate(4000);
        return this.creditAprobat;
    }
}
