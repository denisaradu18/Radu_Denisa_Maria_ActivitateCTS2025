package ro.cts.clase;

public class FactorySupe implements AbstractFactory{
    @Override
    public FelMancare getFelMancare(ITipFelMancare tipFelMancare, String ingredient, int calorii) {
        switch (tipFelMancare){
            case TipSupa.SUPALEGUME -> {
                return new SupaLegume(ingredient,calorii);
            }
            case TipSupa.SUPAPUI -> {
                return new SupaPui(ingredient,calorii);

            }
            default -> {
                return null;
            }
        }
    }
}
