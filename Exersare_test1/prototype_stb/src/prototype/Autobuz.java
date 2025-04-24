package prototype;

public class Autobuz implements AbstractAutobuz{

    private int nrCaltori;
    private String traseu;
    private float pretBilet;

    public Autobuz(int nrCaltori, String traseu, float pretBilet) {
        this.nrCaltori = nrCaltori;
        this.traseu = traseu;
        this.pretBilet = pretBilet;
    }

    public Autobuz() {
        this.nrCaltori=0;
        this.traseu=" ";
        this.pretBilet=0;
    }

    public void setNrCaltori(int nrCaltori) {
        this.nrCaltori = nrCaltori;
    }

    public void setTraseu(String traseu) {
        this.traseu = traseu;
    }

    public void setPretBilet(float pretBilet) {
        this.pretBilet = pretBilet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrCaltori=").append(nrCaltori);
        sb.append(", traseu='").append(traseu).append('\'');
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractAutobuz clone() {
        Autobuz autobuz=new Autobuz();
        autobuz.pretBilet=this.pretBilet;
        autobuz.traseu=this.traseu;
        autobuz.nrCaltori=this.nrCaltori;
        return  autobuz;
    }
}
