package CTS.practice.creationale.SINGLETON.problema4;

public abstract class ObservableStore {
    private String name;
    public ObservableStore(String name) throws RuntimeException {
        this.name = name;
        StoreRegistry.getInstance().registerStore(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ObservableStore{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
