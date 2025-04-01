package ro.cts.clase;

public class Brancardier extends  PersonalSpital{
    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetaliiPersonal() {
        System.out.println(super.toString());

    }
}
