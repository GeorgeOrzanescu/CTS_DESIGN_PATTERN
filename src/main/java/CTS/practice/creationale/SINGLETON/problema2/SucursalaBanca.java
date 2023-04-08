package CTS.practice.creationale.SINGLETON.problema2;

public class SucursalaBanca {

    private String nume = "Fabrica de credite";
    private float fondCredit = 13231232.45F;
    private static SucursalaBanca instance = null;

    private SucursalaBanca(){

    }

    @Override
    public String toString() {
        return "SucursalaBanca{" +
                "nume='" + nume + '\'' +
                ", fondCredit=" + fondCredit +
                '}';
    }

    public synchronized static SucursalaBanca getInstance() {
        if(instance == null) {
            instance =  new SucursalaBanca();
        }
        return instance;
    }
}
