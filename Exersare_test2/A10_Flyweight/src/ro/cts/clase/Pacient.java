package ro.cts.clase;

public class Pacient implements IPacient{
    private  String nume;
    private int nrTelefon;
    private String adresa;

    public Pacient(String nume, int nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void descriereInternare(Salon salon) {
        System.out.println("Pacientul cu numele "+nume+" si numarul de telefon "+nrTelefon+ " este internat pentru "+salon.getNrZile()+" zile");
    }
}
