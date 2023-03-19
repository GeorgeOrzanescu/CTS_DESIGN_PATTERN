package CTS.practice.creationale.PROTOTYPE.problema1;

import java.util.ArrayList;

public class Retata implements IReteta{
    ArrayList<String> ingrediente;

    public Retata(ArrayList<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    // shallow copy no constructor called
    @Override
    public IReteta creazaCopie() throws CloneNotSupportedException {
        return (IReteta) super.clone();
    }

    @Override
    public String toString() {
        return "Retata{" +
                "ingrediente=" + ingrediente +
                '}';
    }
}
