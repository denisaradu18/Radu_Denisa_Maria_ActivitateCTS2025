package ro.cts.clase;

public class Client implements IClient {
    private String nume;
    private int nrAsigurare;

    public Client(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public int getNrAsigurare() {
        return nrAsigurare;
    }

    @Override
    public void decriere(Reteta reteta) {
        System.out.println("Clientul cu numele "+nume+" si nr de aigurare "+nrAsigurare+" are de plata suma de "+reteta.getSuma()+ " pentru "+reteta.getNrMedicamente()+ " medicamente");
    }
}
