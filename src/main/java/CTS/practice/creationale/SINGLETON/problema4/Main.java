package CTS.practice.creationale.SINGLETON.problema4;

public class Main {
    public static void main(String[] args) {

        try {
            UserStore userStore = new UserStore("UserStore");
            LogStore logStore = new LogStore("LogStore");


            UserStore retrievedUserStore = (UserStore) StoreRegistry.getInstance().getStore("UserStore");
            LogStore retrievedLogStore = (LogStore) StoreRegistry.getInstance().getStore("LogStore");


            System.out.println(retrievedUserStore);
            System.out.println(retrievedLogStore);

            logStore.addLog("Test log");
            logStore.addLog("Test log 2");


            System.out.println(((LogStore) StoreRegistry.getInstance().getStore("LogStore")).getLogs());
            System.out.println(retrievedLogStore.getLogs());

            //add an already existing store
            LogStore logStoreDuplicate = new LogStore("LogStore");
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
