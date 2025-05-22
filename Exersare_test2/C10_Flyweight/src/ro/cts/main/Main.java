package ro.cts.main;

import ro.cts.clase.FactoryClient;
import ro.cts.clase.IClient;
import ro.cts.clase.Reteta;

public class Main {
    public static void main(String[]args)
    {
        FactoryClient factoryClient=new FactoryClient();
        Reteta reteta=new Reteta(11,200,12);
        factoryClient.getClient(12).decriere(reteta);
        factoryClient.getClient(12,"Mihaela").decriere(reteta);
    }
}
