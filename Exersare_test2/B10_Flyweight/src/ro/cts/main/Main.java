package ro.cts.main;

import ro.cts.clase.FactoryClient;
import ro.cts.clase.IClient;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[]args){

        FactoryClient factoryClient=new FactoryClient();

        IClient client= factoryClient.getClient("Mihai","0732859332","Bucuresti");
        IClient client1=factoryClient.getClient("Bianca", "0788998899","Galati");

        Rezervare rezervare=new Rezervare(3,5,6);
        Rezervare rezervare1=new Rezervare(5,7,9);

        client1.descriereRezervare(rezervare);
        client.descriereRezervare(rezervare1);

        try {
            factoryClient.getClient("0788998899").descriereRezervare(rezervare);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
