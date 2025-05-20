package ro.cts.main;

import ro.cts.program.Bilet;
import ro.cts.program.BiletGazda;
import ro.cts.program.BiletPrintat;

public class Main {
    public static void main(String[]args) {

        Bilet bilet=new BiletPrintat("Steaua","Dinamo");
        bilet.afisareMesaj();

        Bilet biletGazda=new BiletGazda(bilet, "Steaua");
        biletGazda.afisareMesaj();
    }
}
