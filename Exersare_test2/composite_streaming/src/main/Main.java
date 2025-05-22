package main;

import clase.Clipuri;
import clase.IClip;
import clase.PlayList;

public class Main {
    public static void main(String[]args){
        IClip clip=new Clipuri("Inna","Pop");
        IClip playList=new PlayList("MuzicaBuna",3);
        IClip clip1=new Clipuri("Malibu","Pop");
        IClip clip2=new Clipuri("Brat","Pop");

        try {
            playList.adaugaClip(clip);
            playList.adaugaClip(clip2);
            playList.adaugaClip(clip1);

            playList.afiseazaClip();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
