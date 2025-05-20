package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala extends UnitateBancara{
    public List<UnitateBancara> listaSucursale;
    public Sucursala(String denumire) {
        super(denumire);
        this.listaSucursale=new ArrayList<>();
    }

    @Override
    public void adaugaUnitatea(UnitateBancara unitateBancara) {
       listaSucursale.add(unitateBancara);
    }

    @Override
    public void stergeUnitatea(UnitateBancara unitateBancara) {
      listaSucursale.remove(unitateBancara);
    }

    @Override
    public void afiseazaDetalii() {

        System.out.println("Sucursale cu numele de "+denumire+ " are urmatoarele agentii");
        for(UnitateBancara unitateBancara:listaSucursale)
            unitateBancara.afiseazaDetalii();
    }

    @Override
    public UnitateBancara getInstance(int cheie) {
        return listaSucursale.get(cheie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sucursala{");
        sb.append("listaSucursale=").append(listaSucursale);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
