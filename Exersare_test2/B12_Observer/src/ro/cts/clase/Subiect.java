package ro.cts.clase;

public interface Subiect {
     void abonareObserver(Observer adaugaObserver);
    void dezabonareObserver(Observer stergeObserver);
    void notificareObserver(String notificare);

}
