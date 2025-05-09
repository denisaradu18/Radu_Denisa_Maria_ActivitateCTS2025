package ro.cts.program;

public class SpitalPrivat extends TemplateInternare {

    @Override
    int anlalizaPacient(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    public SpitalPrivat() {
    }

    @Override
    void verificareDisponibilitate() {
        System.out.println("Aveti paturi suficiente");
    }

    @Override
    void emiteFisa(Pacient pacient) {
        System.out.println("Pnetru pacinetul "+pacient.getNume()+ " a fost emisa fisa");
    }
}
