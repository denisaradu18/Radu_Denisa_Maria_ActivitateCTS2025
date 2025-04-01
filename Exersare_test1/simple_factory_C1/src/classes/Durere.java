package classes;

public class Durere extends Medicament{
    public Durere(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String descriere() {
        return super.toString();
    }
}
