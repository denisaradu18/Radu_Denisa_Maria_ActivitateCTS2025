package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements Subiect{
    private List<Observer>clienti;
    public String numeBanca;

    public Banca(String numeBanca) {
        this.clienti = new ArrayList<>();
        this.numeBanca = numeBanca;
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
    public void notificareObserver(String notificare) {

        for(Observer observer:clienti){
            observer.notifica(notificare);
        }
    }

    public void trimiteNotificare(String notificare){
        notificare="Continut mesaj notificare "+notificare;
        notificareObserver(notificare);
    }
}
