package CTS.practice.COMPOSITE.problema1;

public class Sectia implements IOrganigrama{

    private Integer id;

    public Sectia(Integer id) {
        this.id = id;
    }

    @Override
    public void descriere() {
        System.out.println("Sectie " + this.id);
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void adauga(IOrganigrama componenta) {

    }

    @Override
    public void sterge(IOrganigrama componenta) {

    }

    @Override
    public void getComponenta(Integer id) {

    }
}
