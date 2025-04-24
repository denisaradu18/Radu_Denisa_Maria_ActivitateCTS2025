package ro.cts.clase;

public class Masa {
    private boolean esteLibera;
    private int nrMasa;
    private int nrPersoane;

    public Masa(boolean esteLibera, int nrMasa, int nrPersoane) {
        this.esteLibera = esteLibera;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }
}
