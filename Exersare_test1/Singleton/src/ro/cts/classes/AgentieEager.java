package ro.cts.classes;

public class AgentieEager {
    private String nume;
    private float capital;
    private int nrAngajati;
    private static AgentieEager instance=new AgentieEager("AgentieAuto", 2345,20);

    private AgentieEager(String nume, float capital, int nrAngajati) {
        this.nume = nume;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }

    public static AgentieEager getInstance()
    {
        return instance;
    }

}
