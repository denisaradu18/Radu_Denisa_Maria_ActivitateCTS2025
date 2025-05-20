package ro.cts.program;

public abstract class TemplateStadion {
    protected String codSpecatator;

    public TemplateStadion(String codSpecatator) {
        this.codSpecatator = codSpecatator;
    }

    public abstract void asezareLaCoada(String codSpecatator);
    public abstract void prezentareBilet(String codSpecatator);
    public abstract void controlCorporal(String codSpecatator);
    public abstract void intrareStadion(String codSpecatator);
    public abstract void ocupareLoc(String codSpecatator);

    public final void intrareSiOcupareLocStadion(){
        asezareLaCoada(codSpecatator);
        prezentareBilet(codSpecatator);
        controlCorporal(codSpecatator);
        intrareStadion(codSpecatator);
        ocupareLoc(codSpecatator);

    }

}

