package cts.main;

import cts.program.Client;
import cts.program.VanzareMedicamente;

import javax.swing.event.CaretListener;


public class Main {
    public static void main(String[] arg) {

        Client client=new Client("Alina",true,new String[]{"Paracetamol", "Antibiotic"},true);
        VanzareMedicamente modul=new VanzareMedicamente();
        modul.vindeMedicament(client);
        Client client2=new Client("Alina",true,new String[]{"Paracetamol", "Antibiotic"},false);
        modul.vindeMedicament(client2);
    }
}
