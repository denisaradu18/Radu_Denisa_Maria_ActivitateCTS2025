package ro.cts.clase;

public class ClientBanca{
    private String nume;;
    private ITipClient tipClient;

    public ClientBanca(String nume) {
        this.nume = nume;
    }

    public ClientBanca(String nume, ITipClient tipClient) {
        this.nume = nume;
        this.tipClient = tipClient;
    }

    public void setTipClient(ITipClient tipClient) {
        this.tipClient = tipClient;
    }

    public void trimiteDocumente(){
        this.tipClient.procesareDocumente();
    }
}
