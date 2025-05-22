package ro.cts.clase;

public abstract class HandlerCont {
    protected HandlerCont urmatorul;
    protected float sold;

    public void setUrmatorul(HandlerCont urmatorul) {
        this.urmatorul = urmatorul;
    }

    public HandlerCont(float sold) {
        this.sold = sold;
    }

    public abstract void folosesteCard(float suma);
}
