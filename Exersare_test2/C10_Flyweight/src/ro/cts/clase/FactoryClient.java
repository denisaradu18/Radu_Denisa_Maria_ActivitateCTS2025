package ro.cts.clase;

import java.util.HashMap;

public class FactoryClient {
    private HashMap<Integer,IClient> clienti;

    public FactoryClient() {
        this.clienti=new HashMap<>();
    }

    public IClient getClient(int nrAsigurare){
        if(clienti.containsKey(nrAsigurare)){
            return clienti.get(nrAsigurare);
        }else {
            IClient client=new Client("Ion",nrAsigurare);
            clienti.put(nrAsigurare, client);
            return client;
        }
    }
    public IClient getClient(int nrAsigurare,String nume){
        if(clienti.containsKey(nrAsigurare)){
            return clienti.get(nrAsigurare);
        }else {
            IClient client=new Client(nume,nrAsigurare);
            clienti.put(nrAsigurare, client);
            return client;
        }
    }
}
