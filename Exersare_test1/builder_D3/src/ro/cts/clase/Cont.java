package ro.cts.clase;

public class Cont{
    private String nume;
    private boolean primesteSalariu;
    private boolean internetBanking;
    private boolean cardAtasat;

    protected Cont(String nume, boolean primesteSalariu, boolean internetBanking, boolean cardAtasat) {
        this.nume = nume;
        this.primesteSalariu = primesteSalariu;
        this.internetBanking = internetBanking;
        this.cardAtasat = cardAtasat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", primesteSalariu=").append(primesteSalariu);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append('}');
        return sb.toString();
    }



}
