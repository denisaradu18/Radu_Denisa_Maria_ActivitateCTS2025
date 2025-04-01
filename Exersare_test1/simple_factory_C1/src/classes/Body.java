package classes;

public class Body extends Medicament{

    public Body(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String descriere() {
        return "Body"+ super.toString();
    }
}
