package ro.cts.Radu.Denisa.g1098.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(float pretBilet, int nrLocuri, String traseu) {
        super(pretBilet, nrLocuri, traseu);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }
}
