package ro.cts.clase;

public class Client implements ClientAbstract {
    private String nume;
    private String telefon;
    private String email;
    private String adresa;

    public Client(String nume, String telefon, String email, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaInformatiiCont(Cont cont) {
        System.out.println("Client: " + this);
        System.out.println(" → Cont: " + cont);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}

