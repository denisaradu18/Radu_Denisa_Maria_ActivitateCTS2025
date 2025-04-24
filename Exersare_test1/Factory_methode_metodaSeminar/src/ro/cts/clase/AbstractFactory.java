package ro.cts.clase;

public interface AbstractFactory {
  public FelMancare getFelMancare(ITipFelMancare tipFelMancare, String ingredient, int calorii);
}
