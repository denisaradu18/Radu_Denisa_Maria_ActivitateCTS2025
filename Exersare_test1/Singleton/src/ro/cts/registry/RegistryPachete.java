package ro.cts.registry;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {
    private Map<String,PachetTuristic> pachete=new HashMap<>();
    private static RegistryPachete instanta=null;

    private RegistryPachete(){
        pachete.put("cazare", new PachetCazare());
        pachete.put("transport", new PachetTransport());
        pachete.put("cazareTransport", new PachetCazareTransport());
    }

    public PachetTuristic inregistreazaPachet(String nume, PachetTuristic value)
    {
        if(!pachete.containsKey(nume)){
            pachete.put(nume,value);
        }
        return pachete.get(nume);
    }

    public static RegistryPachete getInstance()
    {
        if(instanta==null)
        {
            instanta=new RegistryPachete();
        }
        return instanta;
    }


}
