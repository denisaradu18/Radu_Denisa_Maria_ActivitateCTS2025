package ro.cts.Radu.Denisa.g1098.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(float pretBilet, int nrLocuri, String traseu) {
        super(pretBilet, nrLocuri, traseu);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());

    }
}
