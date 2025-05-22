package ro.cts.clase;

public class AsistentMedical extends HandlerFitness{
    @Override
    public void tratareAccidentari(FisaAccident fisaAccident) {
        System.out.println("Evalueaza accidentarea");
        if(fisaAccident.getNivelGravitate()>5){
            System.out.println("Este chemat medicul salii de fitness");
            urmatorul.tratareAccidentari(fisaAccident);
        }else{
            System.out.println("Asistentul trateaza accidentarea");

        }
    }
}
