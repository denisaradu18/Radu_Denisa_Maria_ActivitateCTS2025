package ro.cts.main;

import ro.cts.clase.Client;
import ro.cts.clase.FactoryPersoanaFizica;
import ro.cts.clase.FactoryPersoanaJuridica;

public class Main {
    public static void main(String[]args)
    {
        FactoryPersoanaFizica factoryPersoanaFizica=new FactoryPersoanaFizica();
        FactoryPersoanaJuridica factoryPersoanaJuridica=new FactoryPersoanaJuridica();

        Client client=factoryPersoanaJuridica.creazaClient("Mihai",456789.8);
        Client clientpf=factoryPersoanaFizica.creazaClient("Laura",234569.9);
        client.descriere();
        clientpf.descriere();
    }

}
