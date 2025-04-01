package ro.cts.main;

import ro.cts.classes.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args){
        AsistentFactory fabricaAsistente=new AsistentFactory();
        BrancardierFactory brancardierFactory= new BrancardierFactory();
        MedicFactory medicFactory=new MedicFactory();

        PersonalSpital asistent=fabricaAsistente.crearePersonal("Marcela", 30, 4500);
        PersonalSpital medic=medicFactory.crearePersonal("Diana", 24,89990);
        PersonalSpital brancardier=brancardierFactory.crearePersonal("Bogdan", 49,6000);


        System.out.println(asistent.descriere());
        System.out.println(brancardier.descriere());
        System.out.println(medic.descriere());

    }
}
