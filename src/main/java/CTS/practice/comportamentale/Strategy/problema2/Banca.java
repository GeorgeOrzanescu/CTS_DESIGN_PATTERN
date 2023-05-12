package CTS.practice.comportamentale.Strategy.problema2;

public class Banca {
    private IStrategie strategie;

    void setStrategie(IStrategie strategie) {
        this.strategie = strategie;
    }

    void verificareActe() {
        this.strategie.procesareDocumente();
    }
}
