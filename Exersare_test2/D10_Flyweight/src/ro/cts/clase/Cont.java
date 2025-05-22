package ro.cts.clase;

public class Cont {
    private String nrCont;
    private double suma;
    private Banca banca;

    public Cont(String nrCont, double suma, Banca banca) {
        this.nrCont = nrCont;
        this.suma = suma;
        this.banca = banca;
    }

    public String getNrCont() {
        return nrCont;
    }

    public double getSuma() {
        return suma;
    }

    public Banca getBanca() {
        return banca;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nrCont='" + nrCont + '\'' +
                ", suma=" + suma +
                ", banca=" + banca +
                '}';
    }
}

