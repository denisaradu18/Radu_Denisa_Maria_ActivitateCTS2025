package ro.cts.main;

import ro.cts.clase.ClientBanca;
import ro.cts.clase.ClientPF;
import ro.cts.clase.ClientPJ;
import ro.cts.clase.ITipClient;

public class Main {
    public static void main(String[]args){
        ITipClient tip=new ClientPF();
        ClientBanca clientBanca=new ClientBanca("Mirela",tip);
        clientBanca.trimiteDocumente();
        clientBanca.setTipClient(new ClientPJ());
        clientBanca.trimiteDocumente();
    }
}
