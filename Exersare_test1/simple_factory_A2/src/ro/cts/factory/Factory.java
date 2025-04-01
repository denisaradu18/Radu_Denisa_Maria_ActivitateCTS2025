package ro.cts.factory;

import ro.cts.clase.Asistent;
import ro.cts.clase.Brancardier;
import ro.cts.clase.Medic;
import ro.cts.clase.PersonalSpital;

public class Factory {

    public Factory() {

    }

    public PersonalSpital getPeronalSpital(TipPersonalSpital tip, String nume, float salariu)
    {
        switch (tip)
        {
            case MEDIC -> {
                Medic medic=new Medic(nume, salariu);
                return medic;
            }
            case ASISTENT -> {
                Asistent asistent=new Asistent(nume,salariu);
                return asistent;
            }
            case BRANCARDIER -> {
                Brancardier brancardier=new Brancardier(nume,salariu);
                return brancardier;
            }
            default -> {
                return null;
            }
        }
    }

}
