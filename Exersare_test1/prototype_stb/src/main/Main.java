package main;

import prototype.AbstractAutobuz;
import prototype.Autobuz;

public class Main {
    public static void main(String []args){
        Autobuz autobuz=new Autobuz();
        Autobuz autobuz1= (Autobuz) autobuz.clone();
        System.out.println(autobuz1);
        System.out.println(autobuz);
    }

}
