package classes;

public class FactoryDurere implements AbstractFactory{
    @Override
    public Medicament getMedicament(String denumire, float pret) {
        return new Durere(denumire,pret);
    }
}
