package CTS.practice.creationale.SINGLETON.problema1;

public class Carte extends Produs {

    public Carte(Integer id) {
        super(id);
    }

    @Override
    public void desriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Carte [] " + this.getId();
    }

}
