package ro.cts.classes;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie)
    {
        System.out.println("La farmacie"+ nume);
        medicamentFarmacie.cumparaMedicament();
    }
}
