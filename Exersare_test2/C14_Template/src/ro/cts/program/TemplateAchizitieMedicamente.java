package ro.cts.program;

public abstract class TemplateAchizitieMedicamente {
    protected int nrComanda;

    public TemplateAchizitieMedicamente(int nrComanda) {
        this.nrComanda = nrComanda;
    }

    public abstract void primesteReteta(int nrComanda);
    public abstract boolean verificaStoc(int nrComanda);
    public abstract void aduceMedicamenteDinDepozit(int nrComanda);
    public abstract void incaseazaBanii(int nrComanda);
    public abstract void scadeStocul(int nrComanda);
    public abstract void emiteBonul(int nrComanda);

    public final void achizitioneazaMedicamente(){
       primesteReteta(nrComanda);
       if(verificaStoc(nrComanda)){
           aduceMedicamenteDinDepozit(nrComanda);
           incaseazaBanii(nrComanda);
           scadeStocul(nrComanda);
           emiteBonul(nrComanda);
       }
    }
}
