package ro.cts.classes;

public class SupaCocos extends Supa
{
    public SupaCocos(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescrierea() {
        System.out.println(super.toString());
    }
}
