package ro.cts.clase;

public abstract class Client{
    private String nume;
    private double valoareCredit;

    public Client(String nume, double valoareCredit) {
        this.nume = nume;
        this.valoareCredit = valoareCredit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", valoareCredit=").append(valoareCredit);
        sb.append('}');
        return sb.toString();
    }

    public abstract void descriere();
}
