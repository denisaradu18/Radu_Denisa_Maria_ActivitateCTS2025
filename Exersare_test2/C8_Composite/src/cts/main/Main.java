package cts.main;

import cts.clase.Categorie;
import cts.clase.Medicament;
import cts.clase.Sectiune;
import cts.clase.SubSectiune;

public class Main {
    public static void main(String[]args){
        Categorie raceala=new Sectiune("Raceala");
        Categorie copii=new SubSectiune("Copii");
        Categorie adulti=new SubSectiune("adulti");
        Categorie medicament1=new Medicament("Nurofen");
        Categorie meddicament2=new Medicament("Panadol");


            try {
                raceala.adaugaCategorie(adulti);
                raceala.adaugaCategorie(copii);
                adulti.adaugaCategorie(medicament1);
                adulti.adaugaCategorie(meddicament2);
                copii.adaugaCategorie(meddicament2);

                raceala.afiseazaDescriere();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
}
