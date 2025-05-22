package ro.cts.main;

import ro.cts.clase.Banca;
import ro.cts.clase.ClientAbstract;
import ro.cts.clase.Cont;
import ro.cts.clase.FabricaClienti;

public class Main {
    public static void main(String[]args){
        FabricaClienti fabrica = new FabricaClienti();

        Banca banca1 = new Banca("BCR", "Bucuresti Nord", 5000000);
        Banca banca2 = new Banca("ING", "Cluj Central", 3000000);

        ClientAbstract client1 = fabrica.getClient("0722333444", "Andrei", "andrei@email.com", "Str. Lalelelor");
        ClientAbstract client2 = fabrica.getClient("0722000111", "Maria", "maria@email.com", "Str. Trandafirilor");

        Cont cont1 = new Cont("RO123456", 1500.50, banca1);
        Cont cont2 = new Cont("RO999888", 9900.00, banca2);
        Cont cont3 = new Cont("RO777666", 2200.75, banca1);
        client1.afiseazaInformatiiCont(cont1);
        client2.afiseazaInformatiiCont(cont2);

        try {
            fabrica.getClient("0722333444").afiseazaInformatiiCont(cont3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
