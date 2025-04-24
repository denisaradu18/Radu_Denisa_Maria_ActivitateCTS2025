package ro.cts.clase;

public class CreditNevoiPersonale extends Credit{
    public CreditNevoiPersonale(String numeClient, String valuta, double valoare) {
        super(numeClient, valuta, valoare);
    }

    @Override
    public void decrere() {

        System.out.println(super.toString());
    }
}
