package cts.main;

import cts.program.Rezultat;
import cts.program.RezultatOnline;
import cts.program.RezultatPrintat;

public class Main {
    public static void main(String[] arg) {
        Rezultat rezultataPrintat=new RezultatPrintat();
        rezultataPrintat.afiseazaRezultat();

        Rezultat rezultatOnline=new RezultatOnline(rezultataPrintat);
        rezultatOnline.afiseazaRezultat();
    }

}
