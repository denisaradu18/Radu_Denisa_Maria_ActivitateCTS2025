package classes;

public class FactoryRaceala implements AbstractFactory{
    @Override
    public Medicament getMedicament(String denumire, float pret) {
        return new Raceala(denumire,pret);
    }
}
