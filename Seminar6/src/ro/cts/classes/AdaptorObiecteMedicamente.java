package ro.cts.classes;

public class AdaptorObiecteMedicamente extends MedicamentFarmacie{

    MedicamentSpital medicamentSpital;

    public AdaptorObiecteMedicamente( MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), "23 martie", true, medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicamente(){
        medicamentSpital.achizitioneazaMedicamentul();
    }
}
