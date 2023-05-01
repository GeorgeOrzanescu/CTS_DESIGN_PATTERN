package CTS.practice.creationale.SINGLETON.problema4;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class StoreRegistry {
    private static StoreRegistry storeRegistry;
    private Map<String,ObservableStore> stores;

    private StoreRegistry() {
        this.stores = new HashMap<>();
    }

    public synchronized  static StoreRegistry getInstance() {
        if(storeRegistry == null) {
            storeRegistry =  new StoreRegistry();
        }
        return storeRegistry;
    }

    public void registerStore(ObservableStore observableStore) {
        if(!stores.containsKey(observableStore.getName())) {
            stores.put(observableStore.getName(),observableStore);
        }
        else {
            throw new RuntimeException("Store with that name already registered!");
        }
    }

    public ObservableStore getStore(String name) {
        return this.stores.get(name);
    }
}
