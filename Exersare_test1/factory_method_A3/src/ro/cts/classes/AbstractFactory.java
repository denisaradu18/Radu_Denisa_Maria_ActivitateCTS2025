package ro.cts.classes;

public interface AbstractFactory {
    public abstract PersonalSpital crearePersonal(String nume, int varsta, float salariu);
}
