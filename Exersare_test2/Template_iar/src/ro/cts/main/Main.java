package ro.cts.main;

import ro.cts.program.DistributieNormala;
import ro.cts.program.DistributieSensInvers;
import ro.cts.program.TemplateMateriel;

public class Main {
    public static void main(String[]args) {
        TemplateMateriel materiel = new DistributieNormala();
        materiel.distribuieMateriale();

        TemplateMateriel materieleInvers=new DistributieSensInvers();
        materieleInvers.distribuieMateriale();
    }
}
