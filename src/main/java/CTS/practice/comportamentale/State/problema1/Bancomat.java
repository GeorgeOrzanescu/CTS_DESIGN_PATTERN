package CTS.practice.comportamentale.State.problema1;

public class Bancomat {
    private IStareBancomat stareBancomat;
    private int sumaDisponibila;

    public Bancomat(int sumaDisponibila) {
        this.sumaDisponibila = sumaDisponibila;
        this.stareBancomat = new BancomatNuAreCard();
    }

    public void introducereCard() {
        this.stareBancomat = new BancomatAreCard();
        System.out.println("Card introdus cu success");
    }

    public void setStareBancomat(IStareBancomat stareBancomat) {
        this.stareBancomat = stareBancomat;
    }

    public void introducerePin() {
        if(this.stareBancomat instanceof BancomatAreCard) {
            this.stareBancomat = new BancomatPinIntrodus();
            System.out.println("Pin introdus");
        }
        else {
            System.out.println("Introduce cardul inainte");
        }

    }

    public void retragereBani(int suma) {
        if(this.stareBancomat instanceof BancomatPinIntrodus) {
            this.stareBancomat = new BancomatPinIntrodus();
            if(suma > this.sumaDisponibila) {
                System.out.println("Bancomatul nu are atatia bani");
                return;
            }
            this.sumaDisponibila  = this.sumaDisponibila - suma;
            System.out.println("Suma retrasa" + suma);
        }
       else {
            System.out.println("Pinul nu este corect");
        }
    }

}
