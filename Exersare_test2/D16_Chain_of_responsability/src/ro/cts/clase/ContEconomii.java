package ro.cts.clase;

public class ContEconomii extends HandlerCont{
    public ContEconomii(float sold) {
        super(sold);
    }

    @Override
    public void folosesteCard(float suma) {
        if(suma<sold){
            sold=sold-suma;
            System.out.println("Plata de "+suma+ " din contul de econimii");
            System.out.println("Soldul cardului este "+sold);

        }else {
            if(urmatorul!=null){
                urmatorul.folosesteCard(suma);
            }
        }
    }
}
