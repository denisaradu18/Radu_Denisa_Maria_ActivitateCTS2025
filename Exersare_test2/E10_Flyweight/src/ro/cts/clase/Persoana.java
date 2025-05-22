package ro.cts.clase;

public class Persoana implements IPersoana{
    private int latime;
    private int inaltime;

    public Persoana(int latime, int inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void deseneaz(LocTribuna locTribuna) {
        System.out.println("Deseneaza persoana"+ this.toString()+ " care se afla la "+ locTribuna);
    }
}
