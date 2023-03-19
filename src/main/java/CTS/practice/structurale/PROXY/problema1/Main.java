package CTS.practice.structurale.PROXY.problema1;

public class Main {
    public static void main(String[] args) {
        IPacient gigel = new Pacient(false);

        gigel.descriere();
        gigel.solicitaInternare();

        IPacient marian = new ProxyPacient((Pacient) gigel);
        marian.descriere();
        marian.solicitaInternare();
    }
}
