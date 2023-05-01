package CTS.practice.comportamentale.Memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerConfigurariProxy {
    private List<MementoConfigurareProxy> configurareProxyList = new ArrayList<>();

    public void addMementoConfigProxy(MementoConfigurareProxy mementoConfigurareProxy) {
        this.configurareProxyList.add(mementoConfigurareProxy);
    }

    public MementoConfigurareProxy getMementoConfigProxy(int index) throws Exception {
        if(this.configurareProxyList.size() >= index ) {
            return this.configurareProxyList.get(index);
        }
        else {
            throw new Exception("No configuration's stored at that index!");
        }
    }
}
