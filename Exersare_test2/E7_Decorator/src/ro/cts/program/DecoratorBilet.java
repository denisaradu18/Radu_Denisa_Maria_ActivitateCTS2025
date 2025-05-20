package ro.cts.program;

public abstract class DecoratorBilet implements Bilet {
    private Bilet bilet;

    public DecoratorBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void afisareMesaj() {
        bilet.afisareMesaj();
        afisareMesajEchupaGazda();
    }

    protected abstract void afisareMesajEchupaGazda();
}
