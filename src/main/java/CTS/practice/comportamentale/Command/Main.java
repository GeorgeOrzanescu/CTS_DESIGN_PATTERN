package CTS.practice.comportamentale.Command;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        Cont cont = new Cont(12);

        managerComenzi.invoke(new Constituire(cont));
        managerComenzi.invoke(new Depunere(cont,140));
        managerComenzi.invoke(new Retragere(cont,40));

        managerComenzi.execute();
        managerComenzi.execute();
        managerComenzi.execute();
    }

}
