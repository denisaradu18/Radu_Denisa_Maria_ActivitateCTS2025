package ro.cts.classes;

public class AsistentFactory implements AbstractFactory{
    @Override
    public PersonalSpital crearePersonal(String nume, int varsta, float salariu) {
        return new Asistent(nume, varsta, salariu);
    }
}
