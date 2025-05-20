package ro.cts.program;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TramvaiSensInvers extends TemplateTramvai {

    @Override
    protected List<String> getStatii() {
        List<String> statii = Arrays.asList("Statia1", "Statia2", "Statia3", "Statia4", "Statia5", "Statia6");
        Collections.reverse(statii);
        return statii;
    }

    @Override
    protected void oprireInStatia(String numeStatii) {

        System.out.println("Oprire in "+numeStatii);
    }
}

