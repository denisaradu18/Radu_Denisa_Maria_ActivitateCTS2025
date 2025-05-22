package ro.cts.clase;

public class FacturaBucatarie {
    private int nrProduse;
    private float sumaDePlata;

    public FacturaBucatarie(int nrProduse, float sumaDePlata) {
        this.nrProduse = nrProduse;
        this.sumaDePlata = sumaDePlata;
    }

    public int getNrProduse() {
        return nrProduse;
    }

    public float getSumaDePlata() {
        return sumaDePlata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FacturaBucatarie{");
        sb.append("nrProduse=").append(nrProduse);
        sb.append(", sumaDePlata=").append(sumaDePlata);
        sb.append('}');
        return sb.toString();
    }
}
