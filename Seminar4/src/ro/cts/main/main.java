package ro.cts.main;

import ro.cts.classes.Supa;
import ro.cts.classes.SupaLegume;
import ro.cts.classes.SupaVita;
import ro.cts.factory.FabricaSupe;
import ro.cts.factory.TipSupe;

public class main {
    public static void main(String[] args){
        FabricaSupe fabricaSupe=new FabricaSupe(19.7f, 300.5f);
        Supa supaLegume=fabricaSupe.getSupa(TipSupe.LEGUME,300);
        Supa supaVita=fabricaSupe.getSupa(TipSupe.VITA, 400);
        Supa supaCocos=fabricaSupe.getSupa(TipSupe.COCOS, 200);

        supaLegume.afiseazaDescrierea();
        supaVita.afiseazaDescrierea();
        supaCocos.afiseazaDescrierea();
    }
}
