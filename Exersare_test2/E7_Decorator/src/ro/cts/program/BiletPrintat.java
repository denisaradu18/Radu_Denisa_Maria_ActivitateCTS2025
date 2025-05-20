package ro.cts.program;

public class BiletPrintat implements Bilet{
    private String numeEchipaGazda;
    private String numeEchipaOaspete;

    public BiletPrintat(String numeEchipaGazda, String numeEchipaOaspete) {
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspete = numeEchipaOaspete;
    }

    @Override
    public void afisareMesaj() {
        System.out.println("Biletul este printat pentru meciul "+numeEchipaGazda+ " si "+numeEchipaOaspete);
    }
}
