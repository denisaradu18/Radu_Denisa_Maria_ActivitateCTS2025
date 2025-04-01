package ro.cts.classes;

public class Asistent extends PersonalSpital{

    public Asistent(String nume, int vasta, float salariu) {
        super(nume, vasta, salariu);
    }

    @Override
    public String descriere() {
        return super.toString();
    }
}
