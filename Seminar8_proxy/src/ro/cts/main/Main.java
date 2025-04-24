package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNumarPersoane;
import ro.cts.clase.ProxyOra;
import ro.cts.clase.Rezervare;

public class Main {
    public static void  main(String []args){
        IRezervare rezervare=new Rezervare();
        rezervare.rezevare("Mirela",5,15);
        IRezervare proxy=new ProxyNumarPersoane(rezervare);
        proxy.rezevare("Mirela",3,15);

        IRezervare proxyOra=new ProxyOra(proxy);
        proxyOra.rezevare("Diana", 6,17);


    }
}
