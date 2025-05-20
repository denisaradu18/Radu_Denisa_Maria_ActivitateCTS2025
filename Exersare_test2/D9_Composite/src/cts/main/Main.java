package cts.main;

import cts.clase.Agentii;
import cts.clase.Filiale;
import cts.clase.Sucursala;
import cts.clase.UnitateBancara;

public class Main {
    public static void main(String[]arg){
        UnitateBancara sucursala=new Sucursala("Sucursala Nationala");
        UnitateBancara agentie=new Agentii("Agentie Roamania");
        UnitateBancara filiala=new Filiale("Filiala Targoviste");
        UnitateBancara filiala2=new Filiale("Filiala Arad");

        UnitateBancara agentie2=new Agentii("Agentie Italia");
        UnitateBancara filiala3=new Filiale("Filiala Roma");

        try {
            sucursala.adaugaUnitatea(agentie);
            sucursala.adaugaUnitatea(agentie2);
            agentie.adaugaUnitatea(filiala);
            agentie.adaugaUnitatea(filiala2);
            agentie2.adaugaUnitatea(filiala3);
            sucursala.afiseazaDetalii();

            System.out.println(sucursala.getInstance(0));
            System.out.println(agentie.getInstance(1));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
