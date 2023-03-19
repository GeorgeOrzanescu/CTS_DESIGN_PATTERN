package CTS.practice.structurale.COMPOSITE.problema1;

import java.util.ArrayList;

public class Departament implements IOrganigrama{

    private Integer id;
    ArrayList<IOrganigrama> subDepartamente;

    public Departament(Integer id, ArrayList<IOrganigrama> subDepartamente) {
        this.id = id;
        this.subDepartamente = subDepartamente;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public void descriere() {
        System.out.println("Departament " + this.id);
        for (int i = 0; i < subDepartamente.size(); i++) {
           subDepartamente.get(i).descriere();
        }
    }

    @Override
    public void adauga(IOrganigrama componenta) {
        subDepartamente.add(componenta);
    }

    @Override
    public void sterge(IOrganigrama componenta) {
        subDepartamente.remove(componenta);
    }

    @Override
    public void getComponenta(Integer index) {
            subDepartamente.get(index).descriere();
    }
}
