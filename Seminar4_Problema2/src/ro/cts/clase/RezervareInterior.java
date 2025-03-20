package ro.cts.clase;

public class RezervareInterior extends AbstractRezervare{
    private boolean esteLaParter;

    public RezervareInterior(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteLaParter) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteLaParter=esteLaParter;
    }

    public RezervareInterior()
    {
        super();
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
        RezervareInterior rezervare=new RezervareInterior();
        rezervare.ziuaLunii=this.ziuaLunii;
        rezervare.numeClient=this.numeClient;
        rezervare.nrParticipanti=this.nrParticipanti;
        rezervare.ora=this.ora;
        rezervare.esteLaParter=this.esteLaParter;

        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareInterior{");
        sb.append("ziuaLunii=").append(ziuaLunii);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", esteLaParter=").append(esteLaParter);
        sb.append('}');
        return sb.toString();
    }
}
