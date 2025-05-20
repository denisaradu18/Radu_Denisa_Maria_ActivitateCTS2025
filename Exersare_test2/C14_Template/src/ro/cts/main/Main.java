package ro.cts.main;

import ro.cts.program.Farmacie;
import ro.cts.program.TemplateAchizitieMedicamente;

public class Main {
    public static void main(String[] args) {
        TemplateAchizitieMedicamente farmacie=new Farmacie(18);
        farmacie.achizitioneazaMedicamente();
    }
}
