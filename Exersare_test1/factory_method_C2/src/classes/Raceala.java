package classes;

public class Raceala extends Medicament{
    public Raceala(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void detalii() {
        System.out.println(super.toString());
    }
}
