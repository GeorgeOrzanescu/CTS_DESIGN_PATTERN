package CTS.practice.structurale.COMPOSITE.problema1;

public interface IOrganigrama {

    void descriere();
    void adauga(IOrganigrama componenta);
    void sterge(IOrganigrama componenta);
    void getComponenta(Integer id);
}
