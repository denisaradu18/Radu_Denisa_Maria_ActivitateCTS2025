package cts.clase;

public class Filiale extends UnitateBancara{
    public Filiale(String denumire) {
        super(denumire);
    }

    @Override
    public void adaugaUnitatea(UnitateBancara unitateBancara) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeUnitatea(UnitateBancara unitateBancara) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public void afiseazaDetalii() {

        System.out.println("Filiala "+ denumire);
    }

    @Override
    public UnitateBancara getInstance(int cheie) throws Exception {
        throw new Exception("Nu este implementata");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Filiale{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
