package cts.main;

import cts.program.Masa;
import cts.program.Receptionist;

public class Main {
    public static void main(String[]arg){

        Masa masa=new Masa(true, 10, 15);
        Receptionist receptionist=new Receptionist();

        System.out.println(receptionist.poateLuaLocLaMasa(masa));

        Masa masa2=new Masa(true, 13, 10);
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));

        Masa masa3=new Masa(false, 10, 3);
        System.out.println(receptionist.poateLuaLocLaMasa(masa3));

    }
}
