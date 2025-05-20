package ro.cts.program;

import java.util.ArrayList;
import java.util.List;

public class Sectiuni extends Locuri{
    private List<Locuri> listaSectiuni;

    public Sectiuni(int nrLoc, String tribuna) {
        super(nrLoc, tribuna);
        this.listaSectiuni=new ArrayList<>();
    }

    @Override
    public void adaugaLoc(Locuri loc) {
        listaSectiuni.add(loc);
    }

    @Override
    public void stergeLoc(Locuri loc) {

        listaSectiuni.remove(loc);
    }

    @Override
    public void descriere() {

        System.out.println("Sectiunea din tribuna: "+getTribuna()+" are urmatoarele subsectiuni/locuri");
        for(Locuri locuri:listaSectiuni)
            locuri.descriere();
    }

    @Override
    public Locuri getInstance(int cheie) {
        return listaSectiuni.get(cheie);

    }
}
