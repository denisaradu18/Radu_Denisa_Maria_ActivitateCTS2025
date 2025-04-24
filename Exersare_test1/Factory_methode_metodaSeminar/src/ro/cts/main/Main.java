package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args)
    {
        FactorySupe factorySupe=new FactorySupe();
        FactoryDesert factoryDesert=new FactoryDesert("vanilie");
        FelMancare supaPui=factorySupe.getFelMancare(TipSupa.SUPALEGUME,"apa",300);
        supaPui.descriere();
        FelMancare tiramisu=factoryDesert.getFelMancare(TipDesert.TIRAMISU, "Piscoturi",500);
        tiramisu.descriere();
    }

}
