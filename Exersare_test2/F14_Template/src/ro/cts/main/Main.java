package ro.cts.main;

import ro.cts.program.TemplateTramvai;
import ro.cts.program.TramvaiSensInvers;
import ro.cts.program.TramvaiSensNormal;

public class Main {
    public static void main(String[] args){
        TemplateTramvai tramvaiNormal=new TramvaiSensNormal();
        tramvaiNormal.parcurgeTraseu();

        TemplateTramvai tramvaiSensInvers=new TramvaiSensInvers();
        tramvaiSensInvers.parcurgeTraseu();
    }
}
