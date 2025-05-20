package cts.program;

public abstract class DecoratorBon implements Bon{
    Bon bon;

    public DecoratorBon(Bon bon) {
        this.bon = bon;
    }

    @Override
    public void afiseazaDetaliiBon() {
        bon.afiseazaDetaliiBon();
    }
}
