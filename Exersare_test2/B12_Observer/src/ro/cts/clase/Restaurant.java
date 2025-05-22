package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect{
    private List<Observer> clienti;
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.clienti=new ArrayList<Observer>();
    }

    @Override
    public void abonareObserver(Observer adaugaObserver) {
        clienti.add(adaugaObserver);
    }

    @Override
    public void dezabonareObserver(Observer stergeObserver) {

        clienti.remove(stergeObserver);
    }

    @Override
    public void notificareObserver(String notificare) {

       for(Observer observer:clienti){
           observer.notifica(notificare);
       }
    }

    public void trimiteNotificare( String produs, float pret){
        String mesaj=" Avem o oferta pentru produsul "+produs+ " la pretul de "+pret;
        notificareObserver(mesaj);


    }
}
