package ro.cts.clase;

public abstract class HandlerFitness {
    protected HandlerFitness urmatorul;

    public void setUrmatorul(HandlerFitness urmatorul) {
        this.urmatorul = urmatorul;
    }
    public abstract void tratareAccidentari(FisaAccident fisaAccident);
}
