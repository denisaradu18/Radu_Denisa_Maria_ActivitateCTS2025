package ro.cts.classes;

public class PacientBuider implements AbstractBuilder {
    private String numePacient;
    private boolean hasPatRabatabil;
    private boolean hasMicDejun;
    private boolean hasPapuciDeCasa;
    private boolean hasHalatInterior;

    public PacientBuider() {
        numePacient="Pacient";
        hasHalatInterior=false;
        hasMicDejun=false;
        hasPapuciDeCasa=false;
        hasPatRabatabil=false;
    }

    public PacientBuider setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public PacientBuider setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;
    }

    public PacientBuider setHasMicDejun(boolean hasMicDejun) {
        this.hasMicDejun = hasMicDejun;
        return this;
    }

    public PacientBuider setHasPapuciDeCasa(boolean hasPapuciDeCasa) {
        this.hasPapuciDeCasa = hasPapuciDeCasa;
        return this;
    }

    public PacientBuider setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return (new Pacient(numePacient, hasPatRabatabil, hasMicDejun, hasPapuciDeCasa, hasHalatInterior));
    }
}
