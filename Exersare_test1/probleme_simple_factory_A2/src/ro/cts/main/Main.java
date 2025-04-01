package ro.cts.main;

import ro.cts.clase.Medic;
import ro.cts.clase.PersonalSpital;
import ro.cts.factory.Factory;
import ro.cts.factory.TipPersonalSpital;

public class Main {
    public static void main(String[]args)
    {

        Factory factory=new Factory();

        PersonalSpital medic=factory.getPeronalSpital(TipPersonalSpital.MEDIC, "Mihai Popescu", 34567.5f);
        PersonalSpital brancardier=factory.getPeronalSpital(TipPersonalSpital.BRANCARDIER, "Ionut", 2345.4f);
        PersonalSpital asistent=factory.getPeronalSpital(TipPersonalSpital.ASISTENT, "Bianca Grigore", 56789.5f);

        medic.afiseazaDetaliiPersonal();
        brancardier.afiseazaDetaliiPersonal();
        asistent.afiseazaDetaliiPersonal();
    }

}
