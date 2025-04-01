package ro.cts.classes;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, int vasta, float salariu) {
        super(nume, vasta, salariu);
    }

    @Override
    public String descriere() {
        return "Brancardierul"+ super.nume +
                "are vasra " + super.vasta +
                "si salariul egal cu" + super.salariu;
    }
}
