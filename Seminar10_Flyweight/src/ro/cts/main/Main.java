package ro.cts.main;

import ro.cts.program.FabricaPacient;
import ro.cts.program.PacientAbstract;
import ro.cts.program.Spitalizare;

public class Main {
    public static void main(String[]args){
        FabricaPacient fabricaPacient=new FabricaPacient();

        PacientAbstract pacientAbstract=fabricaPacient.getPacient("Ion", "0732456123","Email.com");
        Spitalizare spitalizare=new Spitalizare(5,7,10);
        Spitalizare spitalizare1=new Spitalizare(4,8,9);

        Spitalizare spitalizare2=new Spitalizare(3,6,9);
        Spitalizare spitalizare3=new Spitalizare(2,7,8);


        pacientAbstract.afiseazaPacient(spitalizare);
        pacientAbstract.afiseazaPacient(spitalizare1);
        fabricaPacient.getPacient("ioana","078989890","adresa@gmail").afiseazaPacient(spitalizare3);
        fabricaPacient.getPacient("0732456123").afiseazaPacient(spitalizare);
    }
}
