package CTS.practice.COMPOSITE.problema1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Sectia ORL = new Sectia(1);
        Sectia PEDIATRIE = new Sectia(2);

        ArrayList<IOrganigrama> sectii = new ArrayList<>();
        sectii.add(ORL);
        sectii.add(PEDIATRIE);

        Departament subDepartamentCopii = new Departament(5,sectii);
        Departament subDepartamentAdolescentii = new Departament(6,sectii);

        ArrayList<IOrganigrama> subdepartamente = new ArrayList<>();
        subdepartamente.add(subDepartamentCopii);

        Departament departamentCopii = new Departament(10,subdepartamente);
        departamentCopii.adauga(subDepartamentAdolescentii);

        ORL.descriere();
        subDepartamentCopii.descriere();
        departamentCopii.descriere();

    }
}