package ro.cts.main;

import ro.cts.clase.Client;
import ro.cts.clase.Observer;
import ro.cts.clase.Restaurant;

public class Main {
    public static void main(String[]args){
        Observer observer=new Client("Stefan");
        Observer observer1=new Client("Miruna");
        Observer observer2=new Client("Bogdan");

        Restaurant restaurant=new Restaurant("Rose Cafe");
        restaurant.abonareObserver(observer);
        restaurant.abonareObserver(observer1);
        restaurant.abonareObserver(observer2);

        restaurant.notificareObserver("Oferta speciala");
    }
}
