package ro.cts.clase;

public class LocTribuna {
    private int poztie;
    private String culoareTricou;

    public LocTribuna(int poztie, String culoareTricou) {
        this.poztie = poztie;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocTribuna{");
        sb.append("poztie=").append(poztie);
        sb.append(", culoareTricou='").append(culoareTricou).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
