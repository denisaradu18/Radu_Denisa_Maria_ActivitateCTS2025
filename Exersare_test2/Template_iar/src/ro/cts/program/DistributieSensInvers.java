package ro.cts.program;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DistributieSensInvers extends TemplateMateriel{
    @Override
    public List<String> getMateriale() {
        List<String> materiale= Arrays.asList("Depozit Materii prime", "Linie prelucrare", "Linie ambalare", "Depozit final");
        Collections.reverse(materiale);
        return materiale;
    }

    @Override
    public void materialLivrat(String material) {
        System.out.println("Materialul livrat este "+ material);
    }
}
