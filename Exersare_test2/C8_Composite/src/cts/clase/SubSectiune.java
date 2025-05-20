package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SubSectiune implements Categorie{
    private String denumireSubcategorie;
    private List<Categorie> listaSubcategorie;
    @Override
    public void adaugaCategorie(Categorie categorieDeAdaugat) throws Exception {
        listaSubcategorie.add(categorieDeAdaugat);
    }

    public SubSectiune(String denumireSubcategorie) {
        this.denumireSubcategorie = denumireSubcategorie;
        this.listaSubcategorie=new ArrayList<>();
    }

    @Override
    public void stergeCategorie(Categorie categorieDeSters) {

        listaSubcategorie.remove(categorieDeSters);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Categoria secundara "+denumireSubcategorie+ " contine urmatoarele subactegorii: ");
        for(Categorie sectiunePrincipala:listaSubcategorie){
            sectiunePrincipala.afiseazaDescriere();
        }
    }

    @Override
    public Categorie getCategorie(int cheie) {
        return listaSubcategorie.get(cheie);
    }
}
