package ro.cts.Radu.Denisa.g1098.clase;

public abstract class MijlocTransport {
    private float pretBilet;
    private int nrLocuri;
    private String traseu;

    public MijlocTransport(float pretBilet, int nrLocuri, String traseu) {
        this.pretBilet = pretBilet;
        this.nrLocuri = nrLocuri;
        this.traseu = traseu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MijlocTransport{");
        sb.append("pretBilet=").append(pretBilet);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", traseu='").append(traseu).append('\'');
        sb.append('}');
        return sb.toString();
    }
    public abstract void descriere();
}
