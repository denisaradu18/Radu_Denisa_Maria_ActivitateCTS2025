package ro.cts.classes;

public abstract class PersonalSpital {
    protected String nume;
    protected int vasta;
    protected float salariu;

    public PersonalSpital(String nume, int vasta, float salariu) {
        this.nume = nume;
        this.vasta = vasta;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", vasta=").append(vasta);
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }

    public abstract String descriere();

}
