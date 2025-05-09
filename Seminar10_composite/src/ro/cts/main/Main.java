package ro.cts.main;

import ro.cts.program.Departament;
import ro.cts.program.Sectie;
import ro.cts.program.Structura;

public class Main {
    public static void main(String[]args ){
        Structura departament=new Departament("pediatrie",17);
        Structura departament2=new Departament("icu",123);
        Structura departament3=new Departament("general",40);

        Sectie sectie=new Sectie("sectie");
        Sectie sectie1=new Sectie("sectie2");
        Sectie sectie2=new Sectie("Sectie3");

        try{
            departament.adaugaStructura(departament2);
            departament3.adaugaStructura(departament2);

            departament2.adaugaStructura(sectie1);
            departament.adaugaStructura(sectie2);
            departament3.adaugaStructura(sectie);

            departament.afiseazaDescriere();
        } catch (Exception e) {
            System.out.println(e.toString());
        }





    }
}
