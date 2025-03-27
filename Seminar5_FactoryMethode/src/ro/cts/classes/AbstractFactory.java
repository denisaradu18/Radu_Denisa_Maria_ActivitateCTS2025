package ro.cts.classes;

public interface AbstractFactory {
    public FelDeMancare creareFelMancare(TipFelMancare tipFelMancare, float pret, int nrCalorii);
}
