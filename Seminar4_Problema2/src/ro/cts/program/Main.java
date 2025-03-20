package ro.cts.program;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareTerasa;

public class Main {
    public static void main(String[]args)
    {
        AbstractRezervare rezervareTerasa=new RezervareTerasa(12, 15,"Marcel", 12, true);
        System.out.println(rezervareTerasa);
       AbstractRezervare rezervareTerasa2=rezervareTerasa.copiaza(18);
       AbstractRezervare rezervareTerasa3=rezervareTerasa2.copiaza(23);
        System.out.println(rezervareTerasa2);
        System.out.println(rezervareTerasa3);

        rezervareTerasa2.setZiuaLunii(20);
        System.out.println(rezervareTerasa2);


    }
}
