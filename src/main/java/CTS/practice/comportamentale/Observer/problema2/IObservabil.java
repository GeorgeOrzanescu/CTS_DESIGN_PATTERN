package CTS.practice.comportamentale.Observer.problema2;

public interface IObservabil {
   void abonareClient(ClientBanca client);

    void dezabonareClient(ClientBanca client);

    public void notificareClienti(String mesaj);
}
