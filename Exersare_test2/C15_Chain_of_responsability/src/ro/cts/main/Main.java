package ro.cts.main;

import ro.cts.clase.Ajutor;
import ro.cts.clase.Farmacist;
import ro.cts.clase.HandlerFarmacie;

public class Main {
    public static void main(String[]args){
        HandlerFarmacie ajutorFramacie=new Ajutor();
        HandlerFarmacie farmacist=new Farmacist();

        farmacist.setUrmatorul(ajutorFramacie);
        ajutorFramacie.setUrmatorul(null);

        farmacist.preiaComanda("Nurofen");
        farmacist.preiaComanda("Paracetamol");

    }
}
