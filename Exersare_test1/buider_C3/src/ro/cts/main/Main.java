package ro.cts.main;

import ro.cts.clase.Factura;
import ro.cts.clase.FacturaBuilder;

public class Main {
    public static void main(String[] args)
    {
        FacturaBuilder builder=new FacturaBuilder();
        Factura factura=builder.setNumarPungi(3).build();
        System.out.println(factura);
        Factura factura1=builder.setCardFidelitate(true).setCardFidelitate(true).build();
        System.out.println(factura1);
        Factura factura2=builder.setPlataCuCard(true).setCotaTVA(20).build();
        System.out.println(factura2);
    }

}
