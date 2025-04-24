package builder;

public class AutobuzLinie {
    private String model;
    private String sofer;
    private Boolean areOpririCapatLinie;
    private Boolean deschideUsileFiecareStatie;
    private  String textAfisat;

    protected AutobuzLinie(String model, String sofer, Boolean areOpririCapatLinie, Boolean deschideUsileFiecareStatie, String textAfisat) {
        this.model = model;
        this.sofer = sofer;
        this.areOpririCapatLinie = areOpririCapatLinie;
        this.deschideUsileFiecareStatie = deschideUsileFiecareStatie;
        this.textAfisat = textAfisat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", areOpririCapatLinie=").append(areOpririCapatLinie);
        sb.append(", deschideUsileFiecareStatie=").append(deschideUsileFiecareStatie);
        sb.append(", textAfisat='").append(textAfisat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
