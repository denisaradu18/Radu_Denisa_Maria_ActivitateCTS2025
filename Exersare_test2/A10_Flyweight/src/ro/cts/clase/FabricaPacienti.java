package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<Integer, IPacient> coletiePacienti;

    public FabricaPacienti() {
        this.coletiePacienti =new HashMap<>();
    }

    public IPacient getPacient(int nrTelefon) throws Exception {
        IPacient pacient=coletiePacienti.get(nrTelefon);
        if(pacient==null){
            throw new Exception("Pacientul nu este gasit");
        }else{
            return pacient;
        }
    }

    public IPacient getPacient(String nume,int nrTelefon, String adresa){
        IPacient pacient=coletiePacienti.get(nrTelefon);
        if(pacient==null)
        {
            pacient=new Pacient(nume,nrTelefon,adresa);
            coletiePacienti.put(nrTelefon,pacient);
        }
        return pacient;
    }
}
