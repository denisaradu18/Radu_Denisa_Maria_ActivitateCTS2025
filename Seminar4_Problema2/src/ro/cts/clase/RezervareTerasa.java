package ro.cts.clase;

public class RezervareTerasa extends AbstractRezervare{
    private boolean esteFumator;

    public RezervareTerasa() {
        super();
    }

    public RezervareTerasa(int nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }

    @Override
    public AbstractRezervare copiaza(int ziuaLunii) {
      RezervareTerasa rezervareTerasa=new RezervareTerasa();
      rezervareTerasa.nrParticipanti=nrParticipanti;
      rezervareTerasa.numeClient=numeClient;
      rezervareTerasa.ora=ora;
      rezervareTerasa.ziuaLunii=ziuaLunii;
      rezervareTerasa.esteFumator=esteFumator;
      return rezervareTerasa;
    }
}
