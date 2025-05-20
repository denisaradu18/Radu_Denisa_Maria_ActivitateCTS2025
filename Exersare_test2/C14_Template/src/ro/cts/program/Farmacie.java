package ro.cts.program;

public class Farmacie extends TemplateAchizitieMedicamente{
    public Farmacie(int nrComanda) {
        super(nrComanda);
    }

    @Override
    public void primesteReteta(int nrComanda) {
        System.out.println("Reteta a fost primita de la client");
    }

    @Override
    public boolean verificaStoc(int nrComanda) {
        System.out.println("Se verifica stocul in sistem");
        return true;
    }

    @Override
    public void aduceMedicamenteDinDepozit(int nrComanda) {
        System.out.println("Se aduc mediamentele din depozit");

    }

    @Override
    public void incaseazaBanii(int nrComanda) {

        System.out.println("Incaseaza banii");
    }

    @Override
    public void scadeStocul(int nrComanda) {

        System.out.println("Stocul a fost actualizat");
    }

    @Override
    public void emiteBonul(int nrComanda) {

        System.out.println("Bonul a fost emis");
    }
}
