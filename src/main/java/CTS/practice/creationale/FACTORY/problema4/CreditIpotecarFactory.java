package CTS.practice.creationale.FACTORY.problema4;

public class CreditIpotecarFactory implements IFactory {

    @Override
    public ICredit getCredit() {
        return new CreditIpotecar();
    }

}
