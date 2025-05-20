package ro.cts.program;

public class BiletGazda extends DecoratorBilet{

    private String echipaLocala;
    public BiletGazda(Bilet bilet, String echipaLocala) {
        super(bilet);
        this.echipaLocala = echipaLocala;
    }

    @Override
    protected void afisareMesajEchupaGazda() {
        System.out.println("Mult succes echipa "+ echipaLocala);
    }
}
