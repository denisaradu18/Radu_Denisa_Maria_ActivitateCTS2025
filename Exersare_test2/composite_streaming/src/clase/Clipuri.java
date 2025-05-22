package clase;

public class Clipuri implements IClip{
    private String nume;
    private String gen;

    public Clipuri(String nume, String gen) {
        this.nume = nume;
        this.gen = gen;
    }

    @Override
    public void adaugaClip(IClip clip) throws Exception {
        throw new Exception("Nu este disponibil");
    }

    @Override
    public void stergeClip(IClip clip) throws Exception {
        throw new Exception("Nu este disponibil");
    }

    @Override
    public void afiseazaClip() {
        System.out.println("Clip video"+nume);

    }

    @Override
    public IClip getClip(int cheie) throws Exception {
        throw new Exception("Nu este disponibil");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Clipuri{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
