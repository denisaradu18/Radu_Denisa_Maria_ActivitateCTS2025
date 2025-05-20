package cts.program;

public class Receptionist {
    public String poateLuaLocLaMasa(Masa masa){
        Ospatar ospatar=new Ospatar();
        Picolo picolo=new Picolo();

        if(masa.isEsteLibera()){
            if(picolo.esteDebarasata(masa))
            {
                if (ospatar.esteAranjata(masa))
                {
                    return ("Puteti lua loc la masa");
                }else
                {
                    return ("Asteptati, masa nu este inca aranjata");
                }
            }else{
                return ("Asteptati, masa nu este debarasata");
            }
        }else{
            return ("Masa cu nrumarul" +masa.getNrMasa()+ " este ocupata");
        }

    }
}
