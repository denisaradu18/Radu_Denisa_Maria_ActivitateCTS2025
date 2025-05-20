package cts.clase;

public class Pacient {
    private String nume;
    private boolean stareGrava;

    public Pacient(String nume, boolean stareGrava) {
        this.nume = nume;
        this.stareGrava = stareGrava;
    }

    public String getNume() {
        return nume;
    }

    public boolean isStareGrava() {
        return stareGrava;
    }
}
