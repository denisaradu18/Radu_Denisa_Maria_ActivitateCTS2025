package ro.cts.classes;

public class RezervareBuilder implements AbstractBuilder{

    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScaunErg;
    private boolean MasaDecorata;
    private String genMusica;

    public RezervareBuilder() {
        hasAsezareGeam=false;
        hasScaunErg=false;
        MasaDecorata=false;
        genMusica="fara muzica";
    }

    public RezervareBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
        return this;
    }

    public RezervareBuilder setHasScaunErg(boolean hasScaunErg) {
        this.hasScaunErg = hasScaunErg;
        return this;
    }

    public RezervareBuilder setMasaDecorata(boolean masaDecorata) {
        MasaDecorata = masaDecorata;
        return this;
    }

    public RezervareBuilder setGenMusica(String genMusica) {
        this.genMusica = genMusica;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return (new Rezervare(numeClient, hasAsezareGeam, hasScaunErg,MasaDecorata, genMusica)) ;
    }
}
