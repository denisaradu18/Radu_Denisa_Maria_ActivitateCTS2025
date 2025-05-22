package ro.cts.clase;

public class AdapterFactura extends FacturaBar{
    private FacturaBucatarie facturaBucatarie;

    public AdapterFactura( FacturaBucatarie facturaBucatarie) {
        super("20.12.2026", facturaBucatarie.getSumaDePlata(), facturaBucatarie.getNrProduse());
        this.facturaBucatarie = facturaBucatarie;
    }
}
