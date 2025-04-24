package ro.cts.clase;

public class SupaPui extends FelMancare{
    public SupaPui(String ingrediente, int calorii) {
        super(ingrediente, calorii);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }
}
