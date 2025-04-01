package classes;

public class Body extends Medicament{
    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void detalii() {
        System.out.println(super.toString());
    }
}
