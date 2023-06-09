package CTS.practice.structurale.FLYWEIGHT.problema1;

public class DateInternare {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public DateInternare(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }

    public void setNrZileSpitalizare(int nrZileSpitalizare) {
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        return "DateInternare [nrSalon=" + nrSalon + ", nrPat=" + nrPat + ", nrZileSpitalizare=" + nrZileSpitalizare
                + "]";
    }

}
