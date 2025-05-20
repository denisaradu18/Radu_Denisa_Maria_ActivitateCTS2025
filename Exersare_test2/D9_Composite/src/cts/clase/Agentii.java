package cts.clase;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;

public class Agentii extends  UnitateBancara{
    private List<UnitateBancara> listaAgentii;
    public Agentii(String denumire) {
        super(denumire);
        this.listaAgentii=new ArrayList<>();
    }

    @Override
    public void adaugaUnitatea(UnitateBancara unitateBancara) {
        listaAgentii.add(unitateBancara);
    }

    @Override
    public void stergeUnitatea(UnitateBancara unitateBancara) {

        listaAgentii.remove(unitateBancara);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Agentia cu numele "+denumire+" are urmatoarele filiale");
        for(UnitateBancara unitateBancara:listaAgentii)
            unitateBancara.afiseazaDetalii();
    }

    @Override
    public UnitateBancara getInstance(int cheie) {
        return listaAgentii.get(cheie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentii{");
        sb.append("listaAgentii=").append(listaAgentii);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
