package ro.cts.clase;

public class CreditIpotecar extends Credit{
    public CreditIpotecar(String numeClient, String valuta, double valoare) {
        super(numeClient, valuta, valoare);
    }

    @Override
    public void decrere() {
        System.out.println(super.toString());
    }
}
