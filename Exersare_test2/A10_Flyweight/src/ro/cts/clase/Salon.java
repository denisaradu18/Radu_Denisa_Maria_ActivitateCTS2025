package ro.cts.clase;

public class Salon {
    private int nrSalon;
    private int nrPat;
    private int nrZile;

    public Salon(int nrSalon, int nrPat, int nrZile) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNrZile() {
        return nrZile;
    }
}
