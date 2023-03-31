package CTS.practice.creationale.SINGLETON.problema1;

public abstract class Produs {
    private Integer id;

    protected Produs(Integer id) {
        this.id = id;
    }

    public abstract void desriere();

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
