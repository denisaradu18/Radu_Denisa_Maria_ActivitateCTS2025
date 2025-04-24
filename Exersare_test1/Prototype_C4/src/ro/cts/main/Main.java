package ro.cts.main;

import ro.cts.clase.AbstractPrototype;
import ro.cts.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public  static void main(String[]args)
    {
        Map<String,Double> solutie=new HashMap<>();
        solutie.put("Solutie1", 24.4);
        solutie.put("Solutie2",12.3);
        solutie.put("Solutie3",13.4);

        AbstractPrototype reteta=new Reteta("Marian","22345fds","raceala",solutie);
        System.out.println(reteta);
        AbstractPrototype reteta2=reteta.clone();
        System.out.println(reteta2);
    }

}
