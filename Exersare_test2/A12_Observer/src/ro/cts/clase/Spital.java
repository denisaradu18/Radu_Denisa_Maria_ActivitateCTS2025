package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subiect{
    List<Observer> listaPacienti;

    public Spital() {
        this.listaPacienti = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observerDeAdaugat) {
        listaPacienti.add(observerDeAdaugat);
    }

    @Override
    public void stergeObserver(Observer observerDeSters) {

        listaPacienti.remove(observerDeSters);
    }

    @Override
    public void notifica(String mesaj) {

        for(Observer pacient: listaPacienti){
            pacient.primesteMesaj(mesaj);
        }
    }
    public void trimiteUrgenta(String urgenta){
        String mesaj="A aparut un/o "+urgenta+ " in oras";
        notifica(mesaj);
    }
}
