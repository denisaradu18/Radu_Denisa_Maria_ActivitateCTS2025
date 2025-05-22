package ro.cts.main;

import ro.cts.clase.FabricaPersoana;
import ro.cts.clase.IPersoana;
import ro.cts.clase.LocTribuna;

public class Main {
    public static void main(String[]arg){

        FabricaPersoana fabricaPersoana=new FabricaPersoana();

        IPersoana persoana=fabricaPersoana.getPersoana(12,13);
        IPersoana persoana1=fabricaPersoana.getPersoana(18,23);

        LocTribuna locTribuna=new LocTribuna(14,"rosu");
        LocTribuna locTribuna1=new LocTribuna(29,"galben");

        persoana.deseneaz(locTribuna);
        persoana1.deseneaz(locTribuna1);

        try {
            fabricaPersoana.getPersoana(12).deseneaz(locTribuna1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
