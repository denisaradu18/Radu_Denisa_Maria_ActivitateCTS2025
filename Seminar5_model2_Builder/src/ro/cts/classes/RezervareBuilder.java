package ro.cts.classes;

public class RezervareBuilder implements AbstractBuilder{


    private Rezervare rezervare;
    public  RezervareBuilder()
    {
        rezervare=new Rezervare("David", false, false, false, "");
    }

    public RezervareBuilder hasScaunErg(boolean val)
    {
        rezervare.setHasScaunErg(val);
        return this;
    }

    public RezervareBuilder loclaGeam(boolean val)
    {
        rezervare.setHasAsezareGeam(val);
        return this;
    }
    public RezervareBuilder masaDecorata(boolean val)
    {
        rezervare.setMasaDecorata(val);
        return this;
    }

    public RezervareBuilder hasMusic(String val)
    {
        rezervare.setGenMusica(val);
        return this;
    }


    @Override
    public Rezervare build() {
        return rezervare;
    }
}
