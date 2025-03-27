package ro.cts.classes;

public class Papanasi extends FelDeMancare{
    private String crema;


    public Papanasi(float pret, float nrCalorii, String crema) {
        super(pret, nrCalorii);
        this.crema=crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( super.toString()+ " Tiramisu{");
        sb.append("crema='").append(crema).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
