package ro.cts.clase;

public class SupaLegume extends FelMancare{
    public SupaLegume(String ingrediente, int calorii) {
        super(ingrediente, calorii);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }
}
