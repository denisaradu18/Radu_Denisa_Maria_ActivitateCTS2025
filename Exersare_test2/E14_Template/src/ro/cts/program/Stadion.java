package ro.cts.program;

public class Stadion extends TemplateStadion{
    public Stadion(String codSpecatator) {
        super(codSpecatator);
    }

    @Override
    public void asezareLaCoada(String codSpecatator) {
        System.out.println("Se aseaza la coada");
    }

    @Override
    public void prezentareBilet(String codSpecatator) {
        System.out.println("Prezinta biletul cu codul "+codSpecatator);

    }

    @Override
    public void controlCorporal(String codSpecatator) {
        System.out.println("Controlul corporal");
    }

    @Override
    public void intrareStadion(String codSpecatator) {

        System.out.println("Specatorul intra pe stadion");
    }

    @Override
    public void ocupareLoc(String codSpecatator) {
        System.out.println("Spectatorul isi ocupa locul pe stadion");

    }
}
