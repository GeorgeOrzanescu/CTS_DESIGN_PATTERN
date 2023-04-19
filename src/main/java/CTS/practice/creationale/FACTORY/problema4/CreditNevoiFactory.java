package CTS.practice.creationale.FACTORY.problema4;

public class CreditNevoiFactory implements IFactory {

    @Override
    public ICredit getCredit() {
        return new CreditNevoiPersonale();
    }

}
