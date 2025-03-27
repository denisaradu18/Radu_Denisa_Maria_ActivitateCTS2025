package ro.cts.main;

import ro.cts.classes.Rezervare;
import ro.cts.classes.RezervareBuilder;

public class Main {
    public static  void main(String[]args){
        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare=rezervareBuilder.setGenMusica("Rock").setHasAsezareGeam(true).build("Alina");
        System.out.println(rezervare);
        Rezervare rezervare2=rezervareBuilder.setGenMusica("Pop").setMasaDecorata(true).build("Andreea");
        System.out.println(rezervare2);
    }
}
