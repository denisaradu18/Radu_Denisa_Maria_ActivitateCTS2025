package ro.cts.clase;

import java.util.HashMap;

public class FactoryClient {
    private HashMap<String,IClient> colectieClienti;

    public FactoryClient() {
        this.colectieClienti = new HashMap<>();
    }

    public IClient getClient(String nrTelefon) throws Exception {
        IClient client=colectieClienti.get(nrTelefon);
        if(client==null){
            throw new Exception("Nu s a gasit clientul cu numarul introdus");
        }
        return client;
    }

    public IClient getClient(String nume, String nrTelefon, String adresa){
        IClient client=colectieClienti.get(nrTelefon);
        if(client==null){
            client=new Client(nume,nrTelefon,adresa);
            colectieClienti.put(nrTelefon,client);
        }
        return client;
    }
}
