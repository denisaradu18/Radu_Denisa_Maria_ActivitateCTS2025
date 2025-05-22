package ro.cts.main;

import ro.cts.clase.Banca;
import ro.cts.clase.Client;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[]args){

        Observer client1=new Client("Ion");
        Observer client2=new Client("Maria");
        Observer client3=new Client("Bogdan");

        Banca banca=new Banca("Transilvania");

        banca.abonareObserver(client1);
        banca.abonareObserver(client2);
        banca.abonareObserver(client3);

        banca.trimiteNotificare("oferta noua");
    }
}
