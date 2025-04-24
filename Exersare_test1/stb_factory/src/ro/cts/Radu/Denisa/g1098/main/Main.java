package ro.cts.Radu.Denisa.g1098.main;

import ro.cts.Radu.Denisa.g1098.clase.FactoryMijlocTransport;
import ro.cts.Radu.Denisa.g1098.clase.MijlocTransport;
import ro.cts.Radu.Denisa.g1098.clase.TipMijlocTransport;

public class Main {
    public static void main(String[]args)
    {
        FactoryMijlocTransport factoryMijlocTransport=new FactoryMijlocTransport();
        MijlocTransport tramvai=factoryMijlocTransport.getMijlocTransport(TipMijlocTransport.TRAMVAI, 34,100,"Centru");
        MijlocTransport troleibuz=factoryMijlocTransport.getMijlocTransport(TipMijlocTransport.TROLEIBUZ,50, 130,"Sud");


        tramvai.descriere();
        troleibuz.descriere();
    }

}
