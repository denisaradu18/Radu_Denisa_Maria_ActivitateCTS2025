package classes;

public class FactoryBody implements AbstractFactory {
    @Override
    public Medicament getMedicament(String denumire,float pret) {
        return new Body(denumire, pret);
    }
}
