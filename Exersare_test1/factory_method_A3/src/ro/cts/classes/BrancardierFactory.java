package ro.cts.classes;

public class BrancardierFactory implements AbstractFactory{
    @Override
    public PersonalSpital crearePersonal(String nume, int varsta, float salariu) {
        return new Brancardier(nume, varsta, salariu);
    }
}
