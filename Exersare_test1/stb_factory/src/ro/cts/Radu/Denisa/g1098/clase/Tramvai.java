package ro.cts.Radu.Denisa.g1098.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(float pretBilet, int nrLocuri, String traseu) {
        super(pretBilet, nrLocuri, traseu);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }
}
