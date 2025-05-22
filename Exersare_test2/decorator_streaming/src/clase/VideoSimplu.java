package clase;

public class VideoSimplu implements IVideo{
    private String nume;

    public VideoSimplu(String nume) {
        this.nume = nume;
    }

    @Override
    public void afisare() {
        System.out.println("Videoclipul redat este "+nume);
    }
}
