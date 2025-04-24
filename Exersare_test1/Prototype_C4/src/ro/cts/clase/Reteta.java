package ro.cts.clase;

import java.util.Map;

public class Reteta extends AbstractPrototype{
    private String afectiune;
    private Map<String,Double> solutii;

    public Reteta(String numeDoctor, String codReteta, String afectiune, Map<String, Double> solutii) {
        super(numeDoctor, codReteta);
        this.afectiune = afectiune;
        this.solutii = solutii;
    }

    public Reteta(String afectiune, Map<String, Double> solutii) {
        this.afectiune = afectiune;
        this.solutii = solutii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("afectiune='").append(afectiune).append('\'');
        sb.append(", solutii=").append(solutii);
        sb.append(", numeDoctor='").append(numeDoctor).append('\'');
        sb.append(", codReteta='").append(codReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Reteta() {
    }

    public void setAfectiune(String afectiune) {
        this.afectiune = afectiune;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = solutii;
    }

    @Override
    public AbstractPrototype clone() {
       Reteta reteta=new Reteta();
       reteta.codReteta=this.codReteta;
       reteta.numeDoctor=this.numeDoctor;
       reteta.afectiune=this.afectiune;
       reteta.solutii=this.solutii;
       return reteta;
    }
}
