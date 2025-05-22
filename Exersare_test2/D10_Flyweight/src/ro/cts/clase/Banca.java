package ro.cts.clase;

public class Banca {
    private String nume;
    private String sucursala;
    private double capital;

    public Banca(String nume, String sucursala, double capital) {
        this.nume = nume;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nume='" + nume + '\'' +
                ", sucursala='" + sucursala + '\'' +
                ", capital=" + capital +
                '}';
    }
}

