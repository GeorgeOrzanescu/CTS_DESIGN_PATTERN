package CTS.practice.creationale.SINGLETON.problema2;

public class Main {
    public static void main(String[] args) {
        SucursalaBanca singleton = SucursalaBanca.getInstance();

        System.out.println(singleton.toString());
    }
}
