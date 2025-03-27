package ro.cts.classes;

public class Rezervare {
    private String numeClient;
    private boolean hasAsezareGeam;
    private boolean hasScaunErg;
    private boolean MasaDecorata;
    private String genMusica;


    protected Rezervare(String numeClient, boolean hasAsezareGeam, boolean hasScaunErg, boolean masaDecorata, String genMusica) {
        this.numeClient = numeClient;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScaunErg = hasScaunErg;
        MasaDecorata = masaDecorata;
        this.genMusica = genMusica;
    }

    protected void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
    }

    protected void setHasScaunErg(boolean hasScaunErg) {
        this.hasScaunErg = hasScaunErg;
    }

    protected void setMasaDecorata(boolean masaDecorata) {
        MasaDecorata = masaDecorata;
    }

    protected void setGenMusica(String genMusica) {
        this.genMusica = genMusica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScaunErg=").append(hasScaunErg);
        sb.append(", MasaDecorata=").append(MasaDecorata);
        sb.append(", genMusica='").append(genMusica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
