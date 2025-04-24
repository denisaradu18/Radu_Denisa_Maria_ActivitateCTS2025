package ro.cts.clase;

public class Tirmisu extends FelMancare{
    private String crema;

    public Tirmisu(String ingrediente, int calorii, String crema) {
        super(ingrediente, calorii);
        this.crema = crema;
    }

    @Override
    public void descriere() {
        System.out.println("tiramisu are crema de"+this.crema );

    }
}
