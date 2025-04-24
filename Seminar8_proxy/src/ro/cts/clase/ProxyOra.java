package ro.cts.clase;

public class ProxyOra implements IRezervare{
    private IRezervare rezervare;

    public ProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezevare(String numeClient, int numarPersoanem, int ora) {
        if(ora >= 18){
            this.rezervare.rezevare(numeClient,numarPersoanem,ora);
        }else {
            System.out.println("Nu e nevoie de rezervare");
        }
    }
}
