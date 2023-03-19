package CTS.practice.creationale.FACTORY.problema2;

public class Main {
    public static void main(String[] args) {
        ISupa supaLegume = new FactorySupaLegume().preparaSupa();
        supaLegume.descriere();

        ISupa supaVita = new FactorySupaVita().preparaSupa();
        supaVita.descriere();

        ISupa supaCiuperci = new FactorySupaCiuperci().preparaSupa();
        supaCiuperci.descriere();
    }
}
