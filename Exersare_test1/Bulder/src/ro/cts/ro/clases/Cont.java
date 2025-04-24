package ro.cts.ro.clases;

public class Cont {
    private String nume;
    private Boolean areSalariulPeCard;
    private Boolean areCardAfisat;

    public Cont(String nume, Boolean areSalariulPeCard, Boolean areCardAfisat) {
        this.nume = nume;
        this.areSalariulPeCard = areSalariulPeCard;
        this.areCardAfisat = areCardAfisat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areSalariulPeCard='").append(areSalariulPeCard).append('\'');
        sb.append(", areCardAfisat='").append(areCardAfisat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

