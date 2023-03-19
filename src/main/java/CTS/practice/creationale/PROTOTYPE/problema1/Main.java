package CTS.practice.creationale.PROTOTYPE.problema1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ingrediente = new ArrayList<>();
        ingrediente.addAll(List.of(new String[]{"marar", "sare", "piper"}));
        Retata retetaSecreta1 = new Retata(ingrediente);

        try {
            Retata copieReteta1 = (Retata) retetaSecreta1.creazaCopie();
            Retata copieReteta2 = (Retata) retetaSecreta1.creazaCopie();

            copieReteta1.ingrediente.add("zahar");
            // shallow copy
            System.out.println(copieReteta1);
            System.out.println(copieReteta2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
