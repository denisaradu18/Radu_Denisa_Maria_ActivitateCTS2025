package builder;

public class BuilderAutobuzLinie implements AbstractBuilderAutobuzLinie{
    private String model;
    private String sofer;
    private Boolean areOpririCapatLinie;
    private Boolean deschideUsileFiecareStatie;
    private  String textAfisat;


    public BuilderAutobuzLinie() {
        this.model="Necunoscut";
        this.sofer="Necunoscut";
        this.areOpririCapatLinie=false;
        this.deschideUsileFiecareStatie=false;
        this.textAfisat="Necunoscut";
    }

    public BuilderAutobuzLinie setModel(String model) {
        this.model = model;
        return this;
    }

    public BuilderAutobuzLinie setSofer(String sofer) {
        this.sofer = sofer;
        return this;
    }

    public BuilderAutobuzLinie setAreOpririCapatLinie(Boolean areOpririCapatLinie) {
        this.areOpririCapatLinie = areOpririCapatLinie;
        return this;
    }

    public BuilderAutobuzLinie setDeschideUsileFiecareStatie(Boolean deschideUsileFiecareStatie) {
        this.deschideUsileFiecareStatie = deschideUsileFiecareStatie;
        return this;
    }

    public BuilderAutobuzLinie setTextAfisat(String textAfisat) {
        this.textAfisat = textAfisat;
        return this;
    }

    @Override
    public AutobuzLinie build() {
      return new AutobuzLinie(model,sofer,areOpririCapatLinie,deschideUsileFiecareStatie,textAfisat);
    }
}
