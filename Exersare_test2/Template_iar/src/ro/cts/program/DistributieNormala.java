package ro.cts.program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DistributieNormala extends TemplateMateriel{
    @Override
    public List<String> getMateriale() {
        return Arrays.asList("Depozit Materii prime", "Linie prelucrare", "Linie ambalare", "Depozit final");
    }

    @Override
    public void materialLivrat(String material) {

        System.out.println("Materialul livrat este "+ material);
    }
}
