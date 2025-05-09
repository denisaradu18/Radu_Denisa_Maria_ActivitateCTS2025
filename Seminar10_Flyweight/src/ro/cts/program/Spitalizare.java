package ro.cts.program;

public class Spitalizare {
    private int nrSalon;
    private int nrzileSpitaliz;
    private int nrPat;

    public Spitalizare(int nrSalon, int nrzileSpitaliz, int nrPat) {
        this.nrSalon = nrSalon;
        this.nrzileSpitaliz = nrzileSpitaliz;
        this.nrPat = nrPat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spitalizare{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrzileSpitaliz=").append(nrzileSpitaliz);
        sb.append(", nrPat=").append(nrPat);
        sb.append('}');
        return sb.toString();
    }
}
