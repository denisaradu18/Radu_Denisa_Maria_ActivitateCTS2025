package ro.cts.clase;

public class Client implements IClient{
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Client(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public void descriereRezervare(Rezervare rezervare) {
        System.out.println("Clientul cu numele "+nume+ "are o rezervare pentru "+rezervare.getNrPersoane()+" persoane");
    }
}
