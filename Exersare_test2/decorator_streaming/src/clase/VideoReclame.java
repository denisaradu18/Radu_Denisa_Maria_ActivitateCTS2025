package clase;

public class VideoReclame extends Decorator{
    private String produsReclama;


    public VideoReclame(IVideo iVideo, String produsReclama) {
        super(iVideo);
        this.produsReclama = produsReclama;
    }

    @Override
    protected void redareCuReclame() {
        System.out.println("Reclama la "+produsReclama);

    }

}
