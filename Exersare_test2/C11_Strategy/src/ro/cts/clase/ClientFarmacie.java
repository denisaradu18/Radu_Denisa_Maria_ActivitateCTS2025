package ro.cts.clase;

public class ClientFarmacie {
    private String numeClient;
    private IPlata modlaitatePlata;

    public ClientFarmacie(String numeClient, IPlata modlaitatePlata) {
        this.numeClient = numeClient;
        this.modlaitatePlata = modlaitatePlata;
    }

    public ClientFarmacie(String numeClient) {
        this.numeClient = numeClient;
        this.modlaitatePlata = new PlataCash();
    }

    public void setModlaitatePlata(IPlata modlaitatePlata) {
        this.modlaitatePlata = modlaitatePlata;
    }

    public void realizeazaPlata(){
        modlaitatePlata.plateste();
    }
}
