package ro.cts.main;

import ro.cts.program.SpitalPrivat;
import ro.cts.program.Pacient;
import ro.cts.program.SpitalPublic;
import ro.cts.program.TemplateInternare;

public class Main {
    public static void main(String[]args){
        Pacient pacient=new Pacient("Popi", 5);
        TemplateInternare spitalGeneral=new SpitalPublic("Spital");
        TemplateInternare spital2=new SpitalPrivat();
        spital2.internare(pacient);
        spitalGeneral.internare(pacient);
    }
}
