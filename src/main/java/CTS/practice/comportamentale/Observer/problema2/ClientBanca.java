package CTS.practice.comportamentale.Observer.problema2;

public class ClientBanca implements IObserver{
    private String nume;

    public ClientBanca(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(this.nume  + mesaj);
    }
}
