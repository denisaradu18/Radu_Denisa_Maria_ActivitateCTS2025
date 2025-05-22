package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Meci implements Subiect {
    private List<Observer> clienti;
    private String tipMeci;

    public Meci( String tipMeci) {
        this.clienti = new ArrayList<>();
        this.tipMeci = tipMeci;
    }

    @Override
    public void abonareObserver(Observer observer) {
        clienti.add(observer);
    }

    @Override
    public void dezabonareObserver(Observer observer) {

        clienti.remove(observer);
    }

    @Override
    public void notificaObserver(String notificare) {

        for(Observer observer:clienti){
            observer.notifica(notificare);
        }
    }

    public void trimiteNotificare(String notificare){
        notificare="Este un nou meci de "+tipMeci+notificare;
        notificaObserver(notificare);
    }

}
