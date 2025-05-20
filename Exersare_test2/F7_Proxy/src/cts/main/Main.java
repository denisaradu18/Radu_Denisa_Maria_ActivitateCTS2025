package cts.main;

import cts.program.Autobuz;
import cts.program.IAutobuz;
import cts.program.ProxyAutobuz;

public class Main {
    public static void main(String[]args){
    IAutobuz autobuz=new Autobuz();
    IAutobuz proxyAutobuz=new ProxyAutobuz(autobuz);
    proxyAutobuz.opresteAutobuz(23,true);
    proxyAutobuz.opresteAutobuz(18,false);

    }
}
