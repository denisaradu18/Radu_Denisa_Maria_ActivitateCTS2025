package ro.cts.classes;

public class Pacient {
    private String numePacient;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciDeCasa;
    private boolean hasHalatInterior;

    protected Pacient(String numePacient, boolean hasPatRabatabil, boolean hasMicDejun, boolean hasPapuciDeCasa, boolean hasHalatInterior) {
        this.numePacient = numePacient;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejun = hasMicDejun;
        this.hasPapuciDeCasa = hasPapuciDeCasa;
        this.hasHalatInterior = hasHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", hasPatRabatabil=").append(hasPatRabatabil);
        sb.append(", hasMicDejun=").append(hasMicDejun);
        sb.append(", hasPapuciDeCasa=").append(hasPapuciDeCasa);
        sb.append(", hasHalatInterior=").append(hasHalatInterior);
        sb.append('}');
        return sb.toString();
    }
}
