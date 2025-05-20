package ro.cts.program;

public class FarmacieProxy implements IVanzareMedicamente{
    private IVanzareMedicamente farmacie;

    public FarmacieProxy(IVanzareMedicamente farmacie) {
        this.farmacie = farmacie;
    }

    @Override
    public void cumparaMedicament(String numeClient, boolean areReteta) {

        if(areReteta){
            farmacie.cumparaMedicament(numeClient,true);
        }else {
            System.out.println("Clientul "+numeClient+ " nu poate achizitiona pentru ca nu are reteta");
        }
    }
}
