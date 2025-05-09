package ro.cts.program;

public class Sectie implements Structura{
    private String nume;

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        throw new Exception("nu a fost implementat ");
    }

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        throw  new Exception("Nu a fost implemnetat");
    }

    @Override
    public void afiseazaDescriere() {

        System.out.println(nume);
    }

    @Override
    public Structura getStructura(int index) throws Exception{
       throw new Exception("Nu este implementata");
    }
}
