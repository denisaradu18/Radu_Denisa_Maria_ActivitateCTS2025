package classes;

import java.util.Map;

public class RetetaMedicamente implements AbstractReteta{
    private String nume;
    private Map<String, Double> solutii;

    public RetetaMedicamente(String nume, Map<String, Double> solutii) {
        this.nume = nume;
        this.solutii = solutii;
    }

    public RetetaMedicamente()
    {
        this.nume="";
        this.solutii=null;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RetetaMedicamente{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", solutii=").append(solutii);
        sb.append('}');
        return sb.toString();
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = solutii;
    }

    @Override
    public AbstractReteta clone() {
        RetetaMedicamente retetaMedicamente=new RetetaMedicamente();
        retetaMedicamente.setNume(this.nume);
        retetaMedicamente.setSolutii(this.solutii);
        return retetaMedicamente;
    }
}
