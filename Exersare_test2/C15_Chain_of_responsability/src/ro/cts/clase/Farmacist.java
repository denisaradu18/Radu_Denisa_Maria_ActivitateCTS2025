package ro.cts.clase;

public class Farmacist extends HandlerFarmacie{
    @Override
    public void preiaComanda(String medicament) {
        System.out.println("Framacistul a preluat comanda");
        if(urmatorul!=null){
            urmatorul.preiaComanda(medicament);
        }
    }
}
