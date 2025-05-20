package ro.cts.program;

public class MasaRestaurant extends TemplateMasa{
    @Override
    public boolean curataMasa(Masa masa) {
        System.out.println("Se curata masa "+masa.isEsteCuratata());
        masa.setEsteCuratata(true);
        return true;
    }

    @Override
    public boolean aseazaServetele(Masa masa) {
        System.out.println("Se așază șervețelele pe masa " + masa.getNumarMasa());
        masa.setAreServetele(true);
        return true;
    }

    @Override
    public void invitaPersoaneleLaMasa() {

        System.out.println("Clienții sunt invitați să se așeze la masă.");
    }
}
