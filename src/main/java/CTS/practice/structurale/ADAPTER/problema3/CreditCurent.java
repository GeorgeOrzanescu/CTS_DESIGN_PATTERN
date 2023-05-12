package CTS.practice.structurale.ADAPTER.problema3;

public class CreditCurent implements ICredit {
    protected boolean creditAprobat;

    @Override
    public boolean aprobaCredit() {
        this.creditAprobat = Math.random() < 0.2;
        return this.creditAprobat;
    }

    @Override
    public void finalizareCredit() {
        if(this.creditAprobat) {
            System.out.println("Credit aprobat");
        }
        else {
            System.out.println("Credit ne-aprobat");
        }
    }
}
