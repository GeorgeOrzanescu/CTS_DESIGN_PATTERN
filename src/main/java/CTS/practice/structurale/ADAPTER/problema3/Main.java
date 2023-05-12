package CTS.practice.structurale.ADAPTER.problema3;

public class Main {
    public static void main(String[] args) {
        CreditCurent creditCurent1 = new CreditCurent();
        creditCurent1.aprobaCredit();
        creditCurent1.finalizareCredit();

        CreditLeasing creditLeasing = new CreditLeasing();
        creditLeasing.setNrRate(5);
        System.out.println(creditLeasing.verificaEligibilitate(3000));

        AdapterCredit adapterCredit = new AdapterCredit(creditLeasing);
        adapterCredit.aprobaCredit();
        adapterCredit.finalizareCredit();
    }

}
