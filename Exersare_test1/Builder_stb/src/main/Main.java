package main;

import builder.AutobuzLinie;
import builder.BuilderAutobuzLinie;

public class Main {
    public static void main(String[] args)
    {
        BuilderAutobuzLinie builderAutobuzLinie=new BuilderAutobuzLinie();
        AutobuzLinie autobuzLinie=builderAutobuzLinie.setAreOpririCapatLinie(true).build();
        AutobuzLinie autobuzLinie1=builderAutobuzLinie.setSofer("Mihai").build();
        System.out.println(autobuzLinie1);
        System.out.println(autobuzLinie);
    }

}
