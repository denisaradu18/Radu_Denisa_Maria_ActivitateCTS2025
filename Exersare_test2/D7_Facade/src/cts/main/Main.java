package cts.main;

import cts.program.Operator;
import cts.program.Persoana;

public class Main {
    public static void main(String[] arg){
        Persoana persoana=new Persoana("Stefan", 20,true,false);
        Operator operator=new Operator();
        operator.verificareCreareCont(persoana);

        Persoana persoana1=new Persoana("Maria",14, false,false);
        operator.verificareCreareCont(persoana1);

        Persoana persoana2=new Persoana("Mariana",18, false,true);
        operator.verificareCreareCont(persoana2);

        Persoana persoana3=new Persoana("Mara",18, false,false);
        operator.verificareCreareCont(persoana3);




    }
}
