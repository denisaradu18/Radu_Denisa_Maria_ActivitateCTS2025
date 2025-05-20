package cts.program;

public  abstract class DecoratorRezultat implements Rezultat{

    protected  Rezultat rezultatDecorat;

    public DecoratorRezultat(Rezultat rezultatDecorat) {
        this.rezultatDecorat = rezultatDecorat;
    }

    @Override
    public void afiseazaRezultat() {
        rezultatDecorat.afiseazaRezultat();
    }
}
