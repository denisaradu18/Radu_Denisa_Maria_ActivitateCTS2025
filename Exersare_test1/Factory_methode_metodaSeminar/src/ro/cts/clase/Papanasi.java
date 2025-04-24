package ro.cts.clase;

public class Papanasi extends FelMancare{
    private String crema;

    public Papanasi(String ingrediente, int calorii, String crema) {
        super(ingrediente, calorii);
        this.crema = crema;
    }

    @Override
    public void descriere() {
        System.out.println("Papanasii au crema de " + this.crema+ " ingrediente "+super.toString());

    }
}
