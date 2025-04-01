package ro.cts.clase;

public class Medic extends PersonalSpital{
    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetaliiPersonal() {
        System.out.println(super.toString());
    }
}
