package ro.cts.clase;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<String, ClientAbstract> clienti = new HashMap<>();

    public ClientAbstract getClient(String telefon, String nume, String email, String adresa) {
        ClientAbstract client = clienti.get(telefon);
        if (client == null) {
            client = new Client(nume, telefon, email, adresa);
            clienti.put(telefon, client);
        }
        return client;
    }

    public ClientAbstract getClient(String telefon) throws Exception {
        if (!clienti.containsKey(telefon)) {
            throw new Exception("Clientul nu a fost găsit!");
        }
        return clienti.get(telefon);
    }
}

