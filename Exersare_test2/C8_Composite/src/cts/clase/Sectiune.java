package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Categorie{
    private String denumire;
    private List<Categorie> listaSectiuni;



    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.listaSectiuni=new ArrayList<>();
    }

    @Override
    public void adaugaCategorie(Categorie categorieDeAdaugat) throws Exception {
        listaSectiuni.add(categorieDeAdaugat);
    }

    @Override
    public void stergeCategorie(Categorie categorieDeSters) {
         listaSectiuni.remove(categorieDeSters);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Categoria principala "+denumire+" contine urmatoarele subsectiuni");
        for(Categorie sectiunePrincipala: listaSectiuni){
            System.out.println(" ");
            sectiunePrincipala.afiseazaDescriere();
        }

    }

    @Override
    public Categorie getCategorie(int cheie) {
        return listaSectiuni.get(cheie);
    }
}
