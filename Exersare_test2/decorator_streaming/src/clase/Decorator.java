package clase;

public abstract class Decorator implements IVideo{
    private IVideo iVideo;

    public Decorator(IVideo iVideo) {
        this.iVideo = iVideo;
    }

    @Override
    public void afisare() {
        System.out.println("Afiseaza clipul ");
        iVideo.afisare();
        redareCuReclame();
    }

    protected  abstract void redareCuReclame();
}
