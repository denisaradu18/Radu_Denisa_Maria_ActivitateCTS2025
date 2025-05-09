package ro.cts.program;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private int nrAngajati;
    private List<Structura> list;



    public Departament(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
        list =new ArrayList<>();
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        list.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {

        list.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul "+nume+ " are un numar de "+nrAngajati+ " si urmatoarle subsectii ");
        for(Structura structura: list)
        {
            structura.afiseazaDescriere();
        }
    }

    @Override
    public Structura getStructura(int index) throws  Exception {
        return list.get(index);
    }
}
