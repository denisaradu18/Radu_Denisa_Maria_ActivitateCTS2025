package ro.cts.clase;

public class ClientStadion {
    private String nume;
    private ITipSpectator tipSpectator;

    public ClientStadion(String nume, ITipSpectator tipSpectator) {
        this.nume = nume;
        this.tipSpectator = tipSpectator;
    }

    public ClientStadion(String nume) {
        this.nume = nume;
        this.tipSpectator=new SpectatorTribuna();
    }

    public void setTipSpectator(ITipSpectator tipSpectator) {
        this.tipSpectator = tipSpectator;
    }

    public void verificare()
    {
        this.tipSpectator.verificareStadion();
    }
}
