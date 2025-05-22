package ro.cts.main;

import ro.cts.clase.ClientAbonat;
import ro.cts.clase.Meci;
import ro.cts.clase.Observer;

import javax.crypto.interfaces.PBEKey;

public class Main {
    public static void main(String[]args){
        Observer client1=new ClientAbonat("Bogdan");
        Observer clinet2=new ClientAbonat("Bianca");
        Observer client3=new ClientAbonat("Victor");

        Meci meci=new Meci("Fotbal");
        meci.abonareObserver(client1);
        meci.abonareObserver(clinet2);
        meci.abonareObserver(client3);

        meci.trimiteNotificare("Maine");
    }
}
