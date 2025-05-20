package cts.program;

public class Client {
    private String nume;
    private boolean areReteta;
    private String[] medicamente;
    private boolean areCardSnatate;

    public Client(String nume, boolean areReteta, String[] medicamente, boolean areCardSnatate) {
        this.nume = nume;
        this.areReteta = areReteta;
        this.medicamente = medicamente;
        this.areCardSnatate = areCardSnatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    public String[] getMedicamente() {
        return medicamente;
    }

    public boolean isAreCardSnatate() {
        return areCardSnatate;
    }
}
