package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[]args){
        HandlerFitness antrenor=new Antrenor();
        HandlerFitness asistent=new AsistentMedical();
        HandlerFitness medic=new Medic();

        FisaAccident fisaAccident=new FisaAccident("Coma",6);

        antrenor.setUrmatorul(asistent);
        asistent.setUrmatorul(medic);
        medic.setUrmatorul(null);
        fisaAccident.setNivelGravitate(12);

        antrenor.tratareAccidentari(fisaAccident);

    }
}
