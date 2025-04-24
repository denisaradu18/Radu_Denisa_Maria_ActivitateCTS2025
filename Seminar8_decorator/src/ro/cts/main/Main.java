package ro.cts.main;

import ro.cts.clase.Nota;
import ro.cts.clase.NotaDePlata;
import ro.cts.clase.NotaDePlataCraciun;
import ro.cts.clase.NotaPlataRevelion;

public class Main {
    public static void main(String[]args){
        NotaDePlata notaDePlata=new NotaDePlata(500.5f);
        notaDePlata.printare();
        Nota notaDecorata=new NotaPlataRevelion(notaDePlata);
        notaDecorata.printare();

        Nota notaDecorataCraciun=new NotaDePlataCraciun(notaDePlata);
        Nota nota2=new NotaDePlataCraciun(notaDecorata);
        nota2.printare();
    }

}
