package CTS.practice.creationale.SINGLETON.problema1;

public class Haina extends Produs {

    public Haina(Integer id) {
        super(id);
    }

    @Override
    public void desriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Haina [] " + this.getId();
    }
}
