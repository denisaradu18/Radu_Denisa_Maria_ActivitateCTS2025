package ro.cts.classes;

public class Medic extends PersonalSpital{
    public Medic(String nume, int vasta, float salariu) {
        super(nume, vasta, salariu);
    }

    @Override
    public String descriere() {
        return "Medicul "+super.nume+"are salariul "+super.salariu+" si varsta"+super.vasta;
    }
}
