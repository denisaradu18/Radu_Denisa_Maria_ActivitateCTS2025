package ro.cts.clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private int oraRezervare;

    public Rezervare(int nrMasa, int nrPersoane, int oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public int getOraRezervare() {
        return oraRezervare;
    }
}
