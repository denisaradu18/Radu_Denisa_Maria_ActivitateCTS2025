package ro.cts.main;

import ro.cts.program.IVanzareBilet;
import ro.cts.program.ProxyVanzareBilet;
import ro.cts.program.VanzareBilet;

public class Main {
    public static void main(String[]args){
        IVanzareBilet vanzareBilet=new VanzareBilet();
        IVanzareBilet proxyVanzare=new ProxyVanzareBilet(vanzareBilet);

        proxyVanzare.vindeBilet("Mara",19);
        proxyVanzare.vindeBilet("Lavinia",14);
    }
}
