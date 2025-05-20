package ro.cts.main;

import ro.cts.program.Locuri;
import ro.cts.program.Sectiuni;
import ro.cts.program.Subsectie;

public class Main {
    public static void main(String[] args){
        Locuri locuriVip=new Sectiuni(0,"Tribuna VIP");
        Locuri peluza=new Sectiuni(0,"Peluza");

        Locuri locVip=new Subsectie(1,"Tribuna vip nord");
        Locuri locPeluza=new Subsectie(2,"Peluza vest");
        Locuri locVip2=new Subsectie(3,"Tribuna nord");

        try {
            locuriVip.adaugaLoc(locVip);
            locuriVip.adaugaLoc(locVip2);
            peluza.adaugaLoc(locPeluza);

            locuriVip.descriere();
            peluza.descriere();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
