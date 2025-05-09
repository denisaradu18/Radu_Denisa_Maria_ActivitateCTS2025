package src.program;

import src.clase.PachetCazare;
import src.clase.PachetMasinaInchiriata;
import src.clase.PachetTuristic;
import src.inchirieremasini.Masina;
import src.inchirieremasini.MasinaInchiriata;

public class Main {
    private static void printeazaRezervarea(PachetTuristic pachetTuristic){
        System.out.println("Pentru client: ");
        pachetTuristic.descriere();
        System.out.println("Pentru Operator:");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args){
        PachetTuristic pachetcCazare=new PachetCazare();
        printeazaRezervarea(pachetcCazare);

        System.out.println("");
        System.out.println("se doreste utilizarea librariei pentru masini inchiriate");

        System.out.println();
        System.out.println("Utilizarea in modelul clasic");
        Masina masina=new Masina("Opel",1300);
        MasinaInchiriata masinaInchiriata=new MasinaInchiriata(masina);

        System.out.println();
        System.out.println("Nu se foloseste metoda de printare ");
        System.out.println("Pentru client");
        System.out.println(masinaInchiriata.toString());
        System.out.println("Pentru operator");
        masinaInchiriata.inchiriazaMasina();

        System.out.println();
        System.out.println("Se utilizeaza adapterul");
        Masina masina2=new Masina("Renault", 1400);

        System.out.println();
        System.out.println("Acum pachetul este creat direct cu masina dorita");
        PachetMasinaInchiriata pachetMasinaInchiriata=new PachetMasinaInchiriata(masina2);
        System.out.println();
        System.out.println("Se foloseste metoda de printare ");
        printeazaRezervarea(pachetMasinaInchiriata);
    }

}
