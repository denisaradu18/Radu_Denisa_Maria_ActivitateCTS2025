package ro.cts.clase;

public interface Subiect {
    public void abonareObserver(Observer observer);
    public void dezabonareObserver(Observer observer);
    public void notificaObserver(String notificare);
}
