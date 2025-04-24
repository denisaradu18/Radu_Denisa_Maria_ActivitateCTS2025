package ro.cts.clase;

public class Rezervare implements IRezervare {
    @Override
    public void rezevare(String numeClient, int numarPersoanem, int ora) {
        System.out.println(numeClient+ "are o rezervare"+numarPersoanem+"la ora "+ora);
    }
}
