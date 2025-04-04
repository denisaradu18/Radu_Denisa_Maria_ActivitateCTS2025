package ro.cts.classes;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public void achizitioneazaMedicamentul(){
        prezintaRetet();
        System.out.println("medicamentul "+this.nume+" este achizitional la pretul de "+ this.pret);
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void prezintaRetet()
    {
        System.out.println("este prezentata reteta pt mediacmentul"+ this.nume);
    }
}
