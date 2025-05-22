package ro.cts.main;

import ro.cts.clase.Observer;
import ro.cts.clase.Pacient;
import ro.cts.clase.Spital;

public class Main {

    public static void main(String[] args) {
        Spital spital = new Spital();

        Observer p1 = new Pacient("Bianca");
        Observer p2 = new Pacient("Adrian");

        spital.adaugaObserver(p1);
        spital.adaugaObserver(p2);
        spital.trimiteUrgenta("Pandemie");
        spital.stergeObserver(p1);
        spital.trimiteUrgenta("cutremur");
    }
}
