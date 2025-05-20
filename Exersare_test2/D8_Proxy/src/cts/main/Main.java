package cts.main;

import cts.program.Credit;
import cts.program.ICredit;
import cts.program.ProxyCredit;

public class Main {
    public static void main(String[]args){
        ICredit credit=new Credit();
        ICredit proxyCredit=new ProxyCredit(credit);

        proxyCredit.creareCont("Mihai","RON");
        proxyCredit.creareCont("Laura","EURO");
    }
}
