package ro.cts.program;

public class Pacient implements PacientAbstract{
    private String numePacient;
    private String nrTelefon;
    private String adresa;

    public Pacient(String numePacient, String nrTelefon, String adresa) {
        this.numePacient = numePacient;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaPacient(Spitalizare spitalizare) {
        System.out.println(this.toString());
        System.out.println(spitalizare);

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
