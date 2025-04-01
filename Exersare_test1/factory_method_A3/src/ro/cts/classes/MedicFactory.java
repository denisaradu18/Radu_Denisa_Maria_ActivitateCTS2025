package ro.cts.classes;

public class MedicFactory implements AbstractFactory{
    @Override
    public PersonalSpital crearePersonal(String nume, int varsta, float salariu) {
        return new Medic(nume, varsta, salariu);
    }
}
