package main;

import classes.AbstractReteta;
import classes.RetetaMedicamente;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        Map<String, Double> solutii=new HashMap<>();
        solutii.put("Paracetamol", 500.0);
        solutii.put("Teraflu",349.9);
        solutii.put("Nurofen",300.0);

        RetetaMedicamente prototip=new RetetaMedicamente("Raceala",solutii);
        AbstractReteta gripa=prototip.clone();
        System.out.println(prototip);
        System.out.println(gripa);
    }
}
