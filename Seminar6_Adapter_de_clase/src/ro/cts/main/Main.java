package ro.cts.main;

import ro.cts.classes.AdaptorClaseMedicament;
import ro.cts.classes.Farmacie;
import ro.cts.classes.MedicamentFarmacie;
import ro.cts.classes.MedicamentSpital;

public class Main {

    public static void main(String[]args)
    {
        Farmacie farmacie=new Farmacie("Catena");

        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("Paracetamol", "04.05.2025", true, 45);
        MedicamentFarmacie medicamentFarmacie2=new MedicamentFarmacie("Nurofen", "04.05.2025", true, 25);

        farmacie.vindeMedicament(medicamentFarmacie);
        farmacie.vindeMedicament(medicamentFarmacie2);

        MedicamentSpital medicamentSpital=new MedicamentSpital(18, "Ibuprofen");

        AdaptorClaseMedicament adaptorClaseMedicament=new AdaptorClaseMedicament(23, "Parasinus");

        farmacie.vindeMedicament(adaptorClaseMedicament);

    }

}
