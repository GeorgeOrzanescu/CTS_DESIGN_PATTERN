package CTS.practice.structurale.FLYWEIGHT.problema2;

public class Client {
    private String nume;
    private String cnp;

    public Client(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
