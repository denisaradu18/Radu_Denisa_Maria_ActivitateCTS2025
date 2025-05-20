package ro.cts.program;

public abstract class Locuri {
    private int nrLoc;
    private String Tribuna;

    public Locuri(int nrLoc, String tribuna) {
        this.nrLoc = nrLoc;
        Tribuna = tribuna;
    }
    public abstract void adaugaLoc(Locuri loc) throws Exception;
    public abstract void  stergeLoc(Locuri loc) throws Exception;
    public abstract void descriere();
    public abstract Locuri getInstance(int cheie) throws Exception;

    public int getNrLoc() {
        return nrLoc;
    }

    public String getTribuna() {
        return Tribuna;
    }
}
