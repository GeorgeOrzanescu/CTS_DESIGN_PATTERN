package CTS.practice.comportamentale.ChainOfResponsability.problema1;

public abstract class HandlerCont {
    protected int suma;
    private IHandlerCont nextHandler;

    public HandlerCont(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }


    public IHandlerCont getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(IHandlerCont nextHandler) {
        this.nextHandler = nextHandler;
    }
}
