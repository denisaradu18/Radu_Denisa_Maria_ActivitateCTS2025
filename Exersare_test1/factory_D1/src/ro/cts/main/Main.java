package ro.cts.main;

import ro.cts.clase.Credit;
import ro.cts.clase.CreditIpotecar;
import ro.cts.clase.FactoryCredit;
import ro.cts.clase.TipCredit;

public class Main {
    public static void main(String[]args){
        FactoryCredit factoryCredit=new FactoryCredit();
        Credit creditIpotecar=factoryCredit.getProdus(TipCredit.Ipotecare, "Ion", "RON",9000000);
        creditIpotecar.decrere();
        Credit creditNevoiPersonale=factoryCredit.getProdus(TipCredit.NevoiPersonale,"Maria","EURO",77777);
        creditNevoiPersonale.decrere();
    }
}
