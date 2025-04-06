package ro.cts.classes;

public class AgentieLazy {
    private String nume;
    private float capital;
    private int nrAngajati;
    private static AgentieLazy instance=null;

    private AgentieLazy(String nume, float capital, int nrAngajati) {
        this.nume = nume;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
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

    public static AgentieLazy getInstance(String nume, float capital, int nrAngajati)
    {
        if(instance==null)
        {
            instance=new AgentieLazy(nume,capital,nrAngajati);
        }
        return instance;
    }

}
