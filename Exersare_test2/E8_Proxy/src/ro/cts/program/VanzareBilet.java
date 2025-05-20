package ro.cts.program;

public class VanzareBilet implements IVanzareBilet{
    @Override
    public void vindeBilet(String nume, int varsta) {
        System.out.println("Biletul pentru persoana cu numele "+nume);
    }
}
