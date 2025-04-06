package ro.cts.classes;

public class AgentieStaticBlock {
    private String nume;
    private float capita;
    private int nrAngajati;
    private static AgentieStaticBlock instanta;

    static {
        try{
            instanta=new AgentieStaticBlock("AgentieBlock", 234, 123);
        }catch (Exception exception){
            System.out.println("Agentia nu poate fi creata");
        }
    }

    private AgentieStaticBlock(String nume, float capita, int nrAngajati) {
        this.nume = nume;
        this.capita = capita;
        this.nrAngajati = nrAngajati;
    }

    public static AgentieStaticBlock getInstance()
    {
        return instanta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapita() {
        return capita;
    }

    public void setCapita(float capita) {
        this.capita = capita;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieStaticBlock{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capita=").append(capita);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
