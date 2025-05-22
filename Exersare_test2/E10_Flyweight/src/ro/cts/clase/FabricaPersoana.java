package ro.cts.clase;

import java.util.HashMap;

public class FabricaPersoana {
    public HashMap<Integer,IPersoana> colectiePersoane;

    public FabricaPersoana() {
        this.colectiePersoane = new HashMap<>();
    }
    public IPersoana getPersoana(Integer latime) throws Exception {
        IPersoana persoana=colectiePersoane.get(latime);
        if(persoana==null){
            throw new Exception("Nu exista persoana cautata");
            }
        return persoana;
    }

    public IPersoana getPersoana(Integer latime, Integer inaltime) {
        IPersoana persoana=colectiePersoane.get(latime);
        if(persoana==null){
            persoana=new Persoana(latime,inaltime);
            colectiePersoane.put(latime,persoana);
        }
        return persoana;
    }



}
