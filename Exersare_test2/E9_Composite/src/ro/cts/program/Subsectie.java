package ro.cts.program;

import java.util.ArrayList;
import java.util.List;

public class Subsectie extends Locuri{
    public Subsectie(int nrLoc, String tribuna) {
        super(nrLoc, tribuna);
    }


    @Override
    public void adaugaLoc(Locuri loc) throws Exception {
     throw new Exception("Nu este implementat");
    }

    @Override
    public void stergeLoc(Locuri loc) throws Exception {
      throw new Exception("Nu este implementata");
    }
    @Override
    public void descriere() {
        System.out.println("Loc in " + getTribuna() + " cu numarul " + getNrLoc());
    }


    @Override
    public Locuri getInstance(int cheie) throws Exception {
        throw new Exception("nu este implementat");
    }



}
