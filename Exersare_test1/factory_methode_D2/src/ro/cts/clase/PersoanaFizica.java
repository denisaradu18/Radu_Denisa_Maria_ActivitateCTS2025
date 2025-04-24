package ro.cts.clase;

public class PersoanaFizica extends Client{
    public PersoanaFizica(String nume, double valoareCredit) {
        super(nume, valoareCredit);
    }



    @Override
    public void descriere() {
        System.out.println(super.toString());
    }
}
