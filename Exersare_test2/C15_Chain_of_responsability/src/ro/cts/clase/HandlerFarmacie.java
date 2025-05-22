package ro.cts.clase;

public abstract class HandlerFarmacie {
    protected HandlerFarmacie urmatorul;

    public void setUrmatorul(HandlerFarmacie urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void preiaComanda(String medicament);
}
