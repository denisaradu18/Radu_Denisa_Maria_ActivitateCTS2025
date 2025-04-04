package ro.cts.classes;

public class FactoryDesert implements AbstractFactory{

    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }


    @Override
    public FelDeMancare creareFelMancare(TipFelMancare tipFelMancare, float pret, int nrCalorii) {
        switch ((Desert)tipFelMancare){
            case TIRAMISU-> {
                return new Tiramisu(pret, nrCalorii, crema);
            }
            case PAPANASI -> {
                return new Papanasi(pret, nrCalorii, crema);
            }
            default ->{
                return null;
            }
        }
    }
}
//statci block cu tratarea de exceptii
