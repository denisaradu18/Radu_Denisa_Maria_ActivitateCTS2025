package ro.cts.classes;

public class AdaptorClaseMedicament extends MedicamentSpital implements IMedicamentFarmacie{

    public AdaptorClaseMedicament(float pret, String nume) {
        super(pret, nume);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicamentul();
    }
}
