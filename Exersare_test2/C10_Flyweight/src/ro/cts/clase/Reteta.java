package ro.cts.clase;

public class Reteta {
    private int nrReteta;
    private float suma;
    private int nrMedicamente;

    public Reteta(int nrReteta, float suma, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public float getSuma() {
        return suma;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }
}
