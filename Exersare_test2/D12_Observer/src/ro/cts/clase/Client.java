package ro.cts.clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String mesaj) {
        System.out.println("Notificare pentru clientul "+nume+" a primit un mesaj "+mesaj);
    }
}
