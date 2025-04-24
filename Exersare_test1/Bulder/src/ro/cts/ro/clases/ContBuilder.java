package ro.cts.ro.clases;

public class ContBuilder implements ContAbstractBuilder{
    private String nume;
    private boolean areSalariuPeCard;
    private boolean areCardAfisat;

    public ContBuilder(){
        areCardAfisat=false;
        areSalariuPeCard=false;
    }

    public ContBuilder setNume(String nume) {
        this.nume = nume;
        return  this;
    }

    public ContBuilder setAreSalariuPeCard(boolean areSalariuPeCard) {
        this.areSalariuPeCard = areSalariuPeCard;
        return this;
    }

    public ContBuilder setAreCardAfisat(boolean areCardAfisat) {
        this.areCardAfisat = areCardAfisat;
        return this;
    }

    @Override
    public Cont build(String nume) {
        return new Cont(nume,areSalariuPeCard,areCardAfisat);
    }
}
