package cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Boolean> paturiLibere;


    public Salon(int nrPaturi){
        paturiLibere=new ArrayList<>();
        for(int i=0;i<nrPaturi;i++){
            paturiLibere.add(true);
        }
    }

    public boolean arePaturiLibere(){
        return  paturiLibere.contains(true);
    }

    public void ocupaPrimulPatLiber(){
        for(int i=0;i<paturiLibere.size();i++){
            if(paturiLibere.get(i)){
                paturiLibere.set(i,false);
                System.out.println("Patul "+(i+1) + " a fost ocupat");
                break;
            }
        }
    }
}
