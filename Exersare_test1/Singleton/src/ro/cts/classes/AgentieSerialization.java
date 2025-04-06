package ro.cts.classes;

import java.io.Serializable;

public class AgentieSerialization implements Serializable {
    private String nume;
    private float capital;
    private int nrAngajati;
    private static AgentieSerialization instance=null;

    private AgentieSerialization(String nume, float capital, int nrAngajati) {
        this.nume = nume;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public static AgentieSerialization getInstance(String nume, float capital, int nrAngajati)
    {
        if(instance==null)
        {
            instance=new AgentieSerialization(nume,capital,nrAngajati);
        }
        return instance;
    }

    protected Object readResolve()
    {
        return  getInstance("xxx",0,0);
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
        final StringBuilder sb = new StringBuilder("AgentieSerialization{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
