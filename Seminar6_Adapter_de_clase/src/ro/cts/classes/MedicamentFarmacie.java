package ro.cts.classes;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private String nume;
    private String dataExpirare;
    private Boolean esteInStoc;
    private float pret;

    public MedicamentFarmacie(String nume, String dataExpirare, Boolean esteInStoc, float pret) {
        this.nume = nume;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }


    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul"+this.nume+" care expira la "+this.dataExpirare+" are pretul de  "+this.pret);
    }
}
