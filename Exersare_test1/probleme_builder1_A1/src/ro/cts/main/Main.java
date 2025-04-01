package ro.cts.main;

import ro.cts.classes.Pacient;
import ro.cts.classes.PacientBuider;

public class Main {
    public static void main(String[] args){
        PacientBuider pacientBuider=new PacientBuider();
        Pacient pacient=pacientBuider.setHasHalatInterior(true).setHasMicDejun(true).setNumePacient("Ion").build();
        System.out.println(pacient);

        Pacient pacient1=pacientBuider.setHasHalatInterior(true).setNumePacient("Mirela").setHasMicDejun(true).build();
        System.out.println(pacient1);


    }
}
