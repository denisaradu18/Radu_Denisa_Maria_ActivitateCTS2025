package ro.cts.main;

import ro.cts.clase.AbstractBuilder;
import ro.cts.clase.Cont;
import ro.cts.clase.ContBuilder;

public class Main {
    public static void main(String[]args)
    {
        ContBuilder contBuilder=new ContBuilder();
        Cont cont= contBuilder.setCardAtasat(true).build();
        System.out.println(cont);
        Cont contNou=contBuilder.setNume("Mihai").setInternetBanking(true).build();
        System.out.println(contNou);
    }

}
