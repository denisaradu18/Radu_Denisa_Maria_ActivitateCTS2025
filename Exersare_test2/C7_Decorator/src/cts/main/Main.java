package cts.main;

import cts.program.Bon;
import cts.program.BonDeCasa;
import cts.program.Felicitare;

public class Main {
    public static void main(String[] args){
        BonDeCasa bonDeCasa=new BonDeCasa();
        bonDeCasa.afiseazaDetaliiBon();

       Bon bonLMA=new Felicitare(bonDeCasa);
       bonLMA.afiseazaDetaliiBon();
    }
}
