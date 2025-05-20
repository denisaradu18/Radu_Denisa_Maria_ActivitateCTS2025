package cts.clase;

public abstract class UnitateBancara {
    protected String denumire;

    public UnitateBancara(String denumire) {
        this.denumire = denumire;
    }

    public abstract void adaugaUnitatea(UnitateBancara unitateBancara) throws Exception;
    public abstract void stergeUnitatea(UnitateBancara unitateBancara) throws Exception;
     public abstract void afiseazaDetalii();
     public abstract UnitateBancara getInstance(int cheie) throws Exception;
}
