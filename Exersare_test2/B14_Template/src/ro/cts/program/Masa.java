package ro.cts.program;

public class Masa {
    private int numarMasa;
    private boolean esteCuratata;
    private boolean areServetele;

    public Masa(boolean areServetele, boolean esteCuratata, int numarMasa) {
        this.areServetele = areServetele;
        this.esteCuratata = esteCuratata;
        this.numarMasa = numarMasa;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public void setNumarMasa(int numarMasa) {
        this.numarMasa = numarMasa;
    }

    public boolean isEsteCuratata() {
        return esteCuratata;
    }

    public void setEsteCuratata(boolean esteCuratata) {
        this.esteCuratata = esteCuratata;
    }

    public boolean isAreServetele() {
        return areServetele;
    }

    public void setAreServetele(boolean areServetele) {
        this.areServetele = areServetele;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masa{");
        sb.append("numarMasa=").append(numarMasa);
        sb.append(", esteCuratata=").append(esteCuratata);
        sb.append(", areServetele=").append(areServetele);
        sb.append('}');
        return sb.toString();
    }
}
