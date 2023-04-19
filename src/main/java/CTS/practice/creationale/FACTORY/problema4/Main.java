package CTS.practice.creationale.FACTORY.problema4;

public class Main {
    public static void main(String[] args) {
        IFactory factoryCreditNevoiPersonale = new CreditNevoiFactory();
        IFactory factoryCreditIpotecar = new CreditIpotecarFactory();

        ICredit creditIpotecat = factoryCreditIpotecar.getCredit();
        ICredit creditNevoi = factoryCreditNevoiPersonale.getCredit();

        creditIpotecat.descriere();
        creditNevoi.descriere();
    }
}
