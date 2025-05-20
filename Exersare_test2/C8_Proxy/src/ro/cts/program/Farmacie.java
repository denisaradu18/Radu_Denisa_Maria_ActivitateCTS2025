package ro.cts.program;

public class Farmacie implements IVanzareMedicamente{
    @Override
    public void cumparaMedicament(String numeClient, boolean areReteta) {
        System.out.println("Medicamente vandute catre "+numeClient);
    }
}
