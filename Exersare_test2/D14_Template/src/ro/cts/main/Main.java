package ro.cts.main;

import ro.cts.program.Banca;
import ro.cts.program.Card;
import ro.cts.program.TemplateRetragereBancara;

public class Main {
    public static void main(String[]args){
        TemplateRetragereBancara retragereBancara=new Banca();
        Card card=new Card(1245,"Mihai");
        retragereBancara.retaregerBancara(card);
    }
}
