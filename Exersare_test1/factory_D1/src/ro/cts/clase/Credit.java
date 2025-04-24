package ro.cts.clase;

public abstract class Credit{
    private String numeClient;
    private String valuta;
    private double valoare;

    public Credit(String numeClient, String valuta, double valoare) {
        this.numeClient = numeClient;
        this.valuta = valuta;
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", valuta='").append(valuta).append('\'');
        sb.append(", valoare=").append(valoare);
        sb.append('}');
        return sb.toString();
    }

    public abstract void decrere();
}
