package ro.cts.main;

import ro.cts.clase.ClientFarmacie;
import ro.cts.clase.IPlata;
import ro.cts.clase.PlataCard;
import ro.cts.clase.PlataCash;

public class Main {
    public static void main(String[]args){
        ClientFarmacie clientFarmacie=new ClientFarmacie("Maria");
        clientFarmacie.realizeazaPlata();
        IPlata plata=new PlataCard();
        IPlata plataCash=new PlataCash();
        clientFarmacie.setModlaitatePlata(plata);
        clientFarmacie.realizeazaPlata();
    }
}
