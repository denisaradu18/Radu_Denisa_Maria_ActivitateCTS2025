package ro.cts.main;

import ro.cts.classes.AdaptorObiecteMedicamente;
import ro.cts.classes.MedicamentFarmacie;
import ro.cts.classes.MedicamentSpital;

public class Main {
    public static void vindeMedicamente(MedicamentFarmacie medicamentFarmacie)
    {
        System.out.println("Bine ati venit la farmacia Dr Max");
        medicamentFarmacie.cumparaMedicamente();
    }


    public static void main(String[]args)
    {
        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("Paracetamol", "23 noiembrie", true, 34);

        vindeMedicamente(medicamentFarmacie);

        MedicamentSpital medicamentSpital=new MedicamentSpital(23, "Nurofen");
        AdaptorObiecteMedicamente adaptorObiecteMedicamente=new AdaptorObiecteMedicamente(medicamentSpital);

        vindeMedicamente(adaptorObiecteMedicamente);
    }

}
