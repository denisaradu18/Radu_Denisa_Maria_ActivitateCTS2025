package ro.cts.main;

import ro.cts.classes.Rezervare;
import ro.cts.classes.RezervareBuilder;

public class Main {
    public static  void main(String[]args) {

        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare rezervare=rezervareBuilder.hasScaunErg(true).hasMusic("Pop").build();
        System.out.println(rezervare);
        Rezervare rezervare2=rezervareBuilder.hasScaunErg(false).hasMusic("Rock").build();
        System.out.println(rezervare2);
    }
}
