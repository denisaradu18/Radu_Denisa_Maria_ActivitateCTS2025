package ro.cts.clase;

public class Medic extends HandlerFitness{
    @Override
    public void tratareAccidentari(FisaAccident fisaAccident) {
        if(fisaAccident.getNivelGravitate()>10){
            System.out.println("Cheama ambulanta");
        }
        else {
            System.out.println("Trateaza pacientul ");
        }
    }
}
