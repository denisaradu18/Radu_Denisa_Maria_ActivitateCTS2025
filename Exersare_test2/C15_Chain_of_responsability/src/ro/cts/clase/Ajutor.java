package ro.cts.clase;

public class Ajutor extends HandlerFarmacie{
    @Override
    public void preiaComanda(String medicament) {
        System.out.println("Ajutorul a preluat comanda ");
        if(urmatorul!=null){
            urmatorul.preiaComanda(medicament);
        }
    }
}
