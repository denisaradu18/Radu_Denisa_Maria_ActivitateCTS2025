package ro.cts.clase;

public class ProxyNumarPersoane implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezevare(String numeClient, int numarPersoanem, int ora) {
        if(numarPersoanem>4){
            this.rezervare.rezevare(numeClient,numarPersoanem,ora);
        }else {
            System.out.println("Va asteptam la restaurant");
        }
    }
}
