package ro.cts.classes;

public class FactorySupe implements AbstractFactory{

   private int cantitate;

    public FactorySupe(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public FelDeMancare creareFelMancare(TipFelMancare tipFelMancare, float pret, int nrCalorii) {
       switch (tipFelMancare){
           case Supe.SUPACIUPERCI -> {
               return new SupaDeCiuperci(pret, nrCalorii, cantitate);
           }
           case Supe.SUPALEGUME -> {
               return new SupaDeLegume(pret, nrCalorii,cantitate);
           }
           case null, default -> {
               return null;
           }
       }
    }


}
