package cts.program;

public class Felicitare extends DecoratorBon{

    public Felicitare(BonDeCasa bon) {
        super(bon);
    }

    @Override
    public void afiseazaDetaliiBon() {
        bon.afiseazaDetaliiBon();
        System.out.println("La multi ani!!!");
    }
}
