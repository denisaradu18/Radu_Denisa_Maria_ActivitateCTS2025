package ro.cts.program;

public class SpitalPublic extends TemplateInternare{
    private String nume;
    @Override
    int anlalizaPacient(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    public SpitalPublic(String nume) {
        this.nume = nume;
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Nu avem paturi in spitalul "+ this.nume);
    }

    @Override
    void emiteFisa(Pacient pacient) {
        System.out.println("Pacientul a fost transferat la alt spital");
    }
}
