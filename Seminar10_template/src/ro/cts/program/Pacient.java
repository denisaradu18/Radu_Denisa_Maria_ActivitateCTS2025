package ro.cts.program;

public class Pacient {
    private String nume;
    private int gradDificultate;

    public Pacient(String nume, int gradDificultate) {
        this.nume = nume;
        this.gradDificultate = gradDificultate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGradDificultate() {
        return gradDificultate;
    }

    public void setGradDificultate(int gradDificultate) {
        this.gradDificultate = gradDificultate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gradDificultate=").append(gradDificultate);
        sb.append('}');
        return sb.toString();
    }
}
