package ro.cts.main;

import ro.cts.classes.*;

public class Main {
    public static void main(String[]args)
    {
        FactorySupe factorySupa = new FactorySupe(500);
        FactoryDesert factoryDeserturi = new FactoryDesert("vanilie");
        FelDeMancare supaDeLegume = factorySupa.creareFelMancare(Supe.SUPALEGUME, 20.5f, 450);
        FelDeMancare supaDeCiuperci = factorySupa.creareFelMancare(Supe.SUPACIUPERCI, 30.5f, 500);
        FelDeMancare tiramisu = factoryDeserturi.creareFelMancare(Desert.TIRAMISU, 45f, 489);
        System.out.println(supaDeLegume);
        System.out.println(supaDeCiuperci);
        System.out.println(tiramisu);
    }
}
