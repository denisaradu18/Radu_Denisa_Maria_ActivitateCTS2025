package ro.cts.program;

import java.util.Arrays;
import java.util.List;

public class TramvaiSensNormal extends TemplateTramvai{

    @Override
    protected List<String> getStatii() {
        return Arrays.asList("Statia1","Statia2","Statia3","Statia4","Statia5");
    }

    @Override
    protected void oprireInStatia(String numeStatii) {
        System.out.println("Oprire in statia "+numeStatii);
    }
}
