package ro.cts.main;

import ro.cts.program.Farmacie;
import ro.cts.program.FarmacieProxy;
import ro.cts.program.IVanzareMedicamente;

public class Main {
    public static void main(String[] args)
    {
        IVanzareMedicamente farmacie=new Farmacie();
        IVanzareMedicamente proxy=new FarmacieProxy(farmacie);

        proxy.cumparaMedicament("Mara",true);
        proxy.cumparaMedicament("Bianca",false);

    }
}
