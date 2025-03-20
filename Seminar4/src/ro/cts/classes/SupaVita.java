package ro.cts.classes;

public class SupaVita extends Supa{
    public SupaVita(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescrierea() {
        System.out.println(super.toString());
    }
}
