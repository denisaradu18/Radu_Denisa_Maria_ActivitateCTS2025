package ro.cts.factory;

import ro.cts.classes.Supa;
import ro.cts.classes.SupaCocos;
import ro.cts.classes.SupaLegume;
import ro.cts.classes.SupaVita;

public class FabricaSupe {
    private float pret;
    private float calorii;

    public FabricaSupe(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    public Supa getSupa(TipSupe tip, float cantitate){
       switch (tip){
           case LEGUME -> {
               SupaLegume supaLegume=new SupaLegume(pret, cantitate, calorii);
               return supaLegume;
           }
           case VITA -> {
               SupaVita supaVita=new SupaVita(pret, cantitate, calorii);
               return supaVita;
           }
           case COCOS -> {
               SupaCocos supaCocos = new SupaCocos(pret, cantitate, calorii);
               return supaCocos;
           }
           default ->{
               return null;
           }
       }

    }

}
