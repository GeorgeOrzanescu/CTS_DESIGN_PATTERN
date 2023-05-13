package CTS.practice.comportamentale.State.problema2;

import java.util.ArrayList;
import java.util.List;

public class Tribuna {
    private List<IStareLoc> locuri;

    public Tribuna() {
        this.locuri = new ArrayList<>();
    }

    public void adaugaLoc(IStareLoc loc) {
        this.locuri.add(loc);
    }

    public List<IStareLoc> getLocuri() {
        return locuri;
    }

    public void rezervaLoc(int nrLoc) {
        IStareLoc loc = this.locuri.get(nrLoc);
        loc.rezervaLoc(this, nrLoc);
    }
}
