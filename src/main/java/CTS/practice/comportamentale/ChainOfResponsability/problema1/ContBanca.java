package CTS.practice.comportamentale.ChainOfResponsability.problema1;

public class ContBanca extends HandlerCont implements IHandlerCont{
    public ContBanca(int suma) {
        super(suma);
    }

    @Override
    public void gestioneazaPlata(int sumaDePlata) {
        if(this.suma >= sumaDePlata ) {
            this.suma = this.suma - sumaDePlata;
            System.out.println("Plata a fost realizata, suma disponibila:" + (this.suma));
        }else {
            if(this.getNextHandler() == null){
                System.out.println("Plata refuzata");
                return;
            }
            this.getNextHandler().gestioneazaPlata(sumaDePlata);
        }
    }
}
