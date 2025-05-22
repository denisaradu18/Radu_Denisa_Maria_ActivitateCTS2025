package ro.cts.main;

import ro.cts.clase.AdapterFactura;
import ro.cts.clase.FacturaBar;
import ro.cts.clase.FacturaBucatarie;

public class Main {
    public static void facturaAdapter(FacturaBar facturaBar){
        System.out.println(facturaBar.toString());
    }

    public static void main(String[]args ){
        FacturaBar facturaBar=new FacturaBar("13.12.2028",14,5);
        facturaAdapter(facturaBar);

        FacturaBucatarie facturaBucatarie=new FacturaBucatarie(3,14);
        AdapterFactura adapterFactura=new AdapterFactura(facturaBucatarie);
        facturaAdapter(adapterFactura);
    }
}
