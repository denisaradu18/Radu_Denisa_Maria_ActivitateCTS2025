package ro.cts.clase;

public class Antrenor extends HandlerFitness{
    @Override
    public void tratareAccidentari(FisaAccident fisaAccident) {
        if(fisaAccident.getNivelGravitate()>3){
            System.out.println("Antrenorul va chema asistentul medical");
            urmatorul.tratareAccidentari(fisaAccident);
        }else
        {
            System.out.println("Nu se va chema asistentul medical");
        }
    }
}
