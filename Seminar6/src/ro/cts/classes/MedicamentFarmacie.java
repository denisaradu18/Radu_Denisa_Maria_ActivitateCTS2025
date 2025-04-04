package ro.cts.classes;

import javax.swing.text.StyledEditorKit;

public class MedicamentFarmacie {
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

    public void cumparaMedicamente(){
        System.out.println("Medicamentul" +this.nume+ "care expira la date de " + this.dataExpirare+ "are pretul de "+ this.pret);
    }
}
