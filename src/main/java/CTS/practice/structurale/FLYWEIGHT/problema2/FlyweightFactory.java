package CTS.practice.structurale.FLYWEIGHT.problema2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private final Map<Integer, ContBanca> conturi;

    public FlyweightFactory() {
        this.conturi = new HashMap<>();
    }

    public ContBanca getBanca(int nrInregistrare, String valuta, int depozitInitial) {
        if(conturi.containsKey(nrInregistrare)) {
            return conturi.get(nrInregistrare);
        }else {
            ContBanca contNou = new ContBanca(nrInregistrare,valuta,depozitInitial);
            this.conturi.put(nrInregistrare,contNou);
            return contNou;
        }
    }
}
