package ro.cts.clase;

public class Asistent extends PersonalSpital {



    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afiseazaDetaliiPersonal() {
        System.out.println("Asistentul : " + super.toString());
    }

}
