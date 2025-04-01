package main;

import classes.Categorii;
import classes.FabricaMedicamente;
import classes.Medicament;

public class Main {
    public static void main(String[]args){
        FabricaMedicamente fabricaMedicamente=new FabricaMedicamente();
        Medicament medicamentRaceala=fabricaMedicamente.getMedicament(Categorii.RACEALA, "Diclofenat",30);
        Medicament medicamentDurere=fabricaMedicamente.getMedicament(Categorii.DURERE,"Nurofen",45);
        Medicament medicamentBody=fabricaMedicamente.getMedicament(Categorii.BODY,"Paracetamol",29);
        System.out.println(medicamentBody.descriere());
        System.out.println(medicamentRaceala.descriere());
        System.out.println(medicamentDurere.descriere());

    }
}
