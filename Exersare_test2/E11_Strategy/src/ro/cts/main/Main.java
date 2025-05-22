package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[]args){
        ITipSpectator tip=new SpectatorPeluza();
        ClientStadion clientStadion=new ClientStadion("Mihai",tip);
        clientStadion.setTipSpectator(new SpectatorVIP());
        clientStadion.verificare();
        clientStadion.setTipSpectator(new SpectatorVIP());
        clientStadion.verificare();


    }
}
