package ro.cts.clase;

public class FactoryDesert implements AbstractFactory{


    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    @Override
    public FelMancare getFelMancare(ITipFelMancare tipFelMancare, String ingredient, int calorii) {
        switch (tipFelMancare){
            case TipDesert.PAPANASI -> {
                return new Papanasi(ingredient, calorii, crema);
            }
            case TipDesert.TIRAMISU -> {
                return new Tirmisu(ingredient,calorii,crema);
            }

            default ->{
                return null;
            }
        }
    }
}
