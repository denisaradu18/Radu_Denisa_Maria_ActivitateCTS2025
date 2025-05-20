package ro.cts.main;

import ro.cts.program.Card;
import ro.cts.program.ContactLess;
import ro.cts.program.CradSimplu;

public class Main {
    public static void main(String[]args){
        Card card=new CradSimplu("Mihai");
        card.realizeazaPlati();

        Card cardNou=new ContactLess(card);
        cardNou.realizeazaPlati();
    }
}
