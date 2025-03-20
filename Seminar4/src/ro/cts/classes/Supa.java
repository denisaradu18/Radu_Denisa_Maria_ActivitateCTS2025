package ro.cts.classes;

public abstract class Supa {
    private float pret;
    private float cantitate;
    private float calorii;

    public Supa(float pret, float cantitate, float calorii) {
        this.pret = pret;
        this.cantitate = cantitate;
        this.calorii = calorii;
    }

    public float getPret() {
        return pret;
    }

    public float getCantitate() {
        return cantitate;
    }

    public float getCalorii() {
        return calorii;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "pret=" + pret +
                ", cantitate=" + cantitate +
                ", calorii=" + calorii +
                '}';
    }

    public float calculeazPretPeSutaDeGrame()
    {
        return pret/cantitate*100;
    }

    public abstract void afiseazaDescrierea();


}
