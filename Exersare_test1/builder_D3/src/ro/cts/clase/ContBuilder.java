package ro.cts.clase;

public class ContBuilder implements AbstractBuilder {
    private String nume;
    private boolean primesteSalariu;
    private boolean internetBanking;
    private boolean cardAtasat;

    public ContBuilder() {
        this.nume="Necunoscut";
        this.primesteSalariu=false;
        this.internetBanking=false;
        this.cardAtasat=false;
    }

    public ContBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public ContBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    @Override
    public Cont build() {
        return new Cont(nume,primesteSalariu,internetBanking,cardAtasat);
    }
}
