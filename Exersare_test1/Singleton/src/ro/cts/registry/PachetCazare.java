package ro.cts.registry;

public class PachetCazare implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine informatii despre cazare");
    }

    public PachetCazare() {
    }
}
