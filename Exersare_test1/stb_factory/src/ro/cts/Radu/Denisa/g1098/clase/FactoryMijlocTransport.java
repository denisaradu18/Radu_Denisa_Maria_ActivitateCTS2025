package ro.cts.Radu.Denisa.g1098.clase;

public class FactoryMijlocTransport {
    public MijlocTransport getMijlocTransport(TipMijlocTransport tipMijlocTransport, float pretBilet, int nrLocuri, String traseu){
        switch (tipMijlocTransport){
            case TRAMVAI -> {
                return new Tramvai(pretBilet, nrLocuri, traseu);
           }
            case TROLEIBUZ -> {
                return new Troleibuz(pretBilet, nrLocuri, traseu);
            }
            case AUTOBUZ -> {
                return new Autobuz(pretBilet, nrLocuri, traseu);
            }
            default -> {
                return null;
            }
        }

    }
}
