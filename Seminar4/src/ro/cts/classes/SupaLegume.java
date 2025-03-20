package ro.cts.classes;

public class SupaLegume  extends Supa{

    public SupaLegume(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescrierea() {
        System.out.println("Supa are pretul "+ getPret()+ " gramaj "+ getCantitate()+" nr calorii "+ getCalorii());
    }
}
