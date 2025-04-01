package main;

import classes.FactoryBody;
import classes.FactoryDurere;
import classes.FactoryRaceala;
import classes.Medicament;

public class Main {
    public static void main(String[]args)
    {
        FactoryRaceala factoryRaceala=new FactoryRaceala();
        FactoryDurere factoryDurere=new FactoryDurere();
        FactoryBody factoryBody=new FactoryBody();

        Medicament medicamentRaceala=factoryRaceala.getMedicament("Paracetamol",25);
        medicamentRaceala.detalii();
        Medicament medicamentDurere=factoryDurere.getMedicament("Nurofen",30);
        medicamentDurere.detalii();
        Medicament medicamentBody=factoryBody.getMedicament("Crema", 79);
        medicamentBody.detalii();

    }

}
