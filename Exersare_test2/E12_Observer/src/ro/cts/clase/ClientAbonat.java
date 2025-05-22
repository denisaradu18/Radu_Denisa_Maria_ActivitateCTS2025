package ro.cts.clase;

public class ClientAbonat implements Observer{
    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String notificare) {
        System.out.println("Notificare pentru clientul "+nume+"are urmatorul mesaj"+notificare);
    }
}
