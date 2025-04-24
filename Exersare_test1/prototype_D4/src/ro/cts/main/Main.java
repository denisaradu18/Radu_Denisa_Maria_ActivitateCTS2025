package ro.cts.main;

import ro.cts.clasa.ContBanca;
import ro.cts.clasa.ContPrototype;

public class Main {
    public static void main(String[]args) {
        ContBanca cont = new ContBanca("Bianca",234567,"RON");
        ContBanca contBanca = (ContBanca) cont.clone();
        System.out.println(cont);
        contBanca.setSuma(45678);
        System.out.println(contBanca);
    }
}
