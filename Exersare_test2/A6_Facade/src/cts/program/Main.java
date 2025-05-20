package cts.program;

import cts.clase.FacadeInternare;
import cts.clase.Medic;
import cts.clase.Pacient;
import cts.clase.Salon;

public class Main {
    public static void main(String[] args){
        Pacient pacient1=new Pacient("Andrei",true);
        Pacient pacient2=new Pacient("Adrian", false);

        Medic medic=new Medic();
        Salon salon =new Salon(2);

        FacadeInternare internare=new FacadeInternare(medic,salon);
        internare.interneazaPacient(pacient1);
        internare.interneazaPacient(pacient2);
    }
}
