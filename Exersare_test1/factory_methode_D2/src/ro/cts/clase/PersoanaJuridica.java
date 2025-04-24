package ro.cts.clase;

public class PersoanaJuridica extends Client{
    public PersoanaJuridica(String nume, double valoareCredit) {
        super(nume, valoareCredit);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }
}
