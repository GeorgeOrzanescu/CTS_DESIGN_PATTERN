package CTS.practice.comportamentale.Memento;

public class Main {
    public static void main(String[] args) {
        ConfigurareProxy configurareProxy = new ConfigurareProxy(
                "http://mock-url.com",
                new String[]{"mock1", "mock2"},
                new String[]{"mock1", "mock2"},
                2
                );

        System.out.println(configurareProxy);
        ManagerConfigurariProxy managerConfigurariProxy = new ManagerConfigurariProxy();

        managerConfigurariProxy.addMementoConfigProxy(configurareProxy.createMementoConfigProxy());
        configurareProxy.setTargetUrl("http://mock-url-2.com");
        managerConfigurariProxy.addMementoConfigProxy(configurareProxy.createMementoConfigProxy());

        System.out.println(configurareProxy);


        try {
            MementoConfigurareProxy mementoConfigurareProxy1 = managerConfigurariProxy.getMementoConfigProxy(0);
            configurareProxy.setMementoConfigProxy(mementoConfigurareProxy1);

            System.out.println(configurareProxy);
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
