package ro.cts.registry;

public class PachetTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine informatii despre transport");
    }

    public PachetTransport() {
    }
}
