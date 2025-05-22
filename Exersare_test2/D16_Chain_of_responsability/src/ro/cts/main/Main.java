package ro.cts.main;

import ro.cts.clase.ContCredit;
import ro.cts.clase.ContCurent;
import ro.cts.clase.ContEconomii;
import ro.cts.clase.HandlerCont;

public class Main {
    public static void main(String[] args){
        HandlerCont conCurent=new ContCurent(99);
        HandlerCont contEconomii=new ContEconomii(2456);
        HandlerCont contCredit=new ContCredit(3456);

        conCurent.setUrmatorul(contEconomii);
        contEconomii.setUrmatorul(contCredit);
        contCredit.setUrmatorul(null);

        conCurent.folosesteCard(200);
        conCurent.folosesteCard(20);
        conCurent.folosesteCard(3000);
    }
}
