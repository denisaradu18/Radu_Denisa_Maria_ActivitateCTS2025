package cts.program;

public class RezultatOnline extends DecoratorRezultat {


    public RezultatOnline(Rezultat rezultatDecorat) {
        super(rezultatDecorat);
    }
    @Override
    public void afiseazaRezultat() {
        rezultatDecorat.afiseazaRezultat();
        System.out.println("Rezultatul este disponibil și ONLINE.");
    }

}
