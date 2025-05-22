package main;

import clase.IVideo;
import clase.VideoReclame;
import clase.VideoSimplu;

public class Main {
    public static void main(String[]args){
        IVideo video=new VideoSimplu("Pop");
        video.afisare();
        IVideo video1=new VideoReclame(video,"Dero");
        video1.afisare();
    }
}
