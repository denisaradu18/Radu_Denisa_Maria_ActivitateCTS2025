package cts.program;

public class Reteta {
    public boolean verificaReteta(Client client){
        System.out.println("Verifica reteta clientului "+client.getNume());
        return client.isAreReteta();
    }
}
