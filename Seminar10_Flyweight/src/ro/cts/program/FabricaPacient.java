package ro.cts.program;

import java.util.HashMap;

public class FabricaPacient {
    private HashMap<String,PacientAbstract> colectiePacienti;

    public FabricaPacient() {
        this.colectiePacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String nrTelefon)
    {
        PacientAbstract pacientAbstract=colectiePacienti.get(nrTelefon);
        if(pacientAbstract==null){
            try {
                throw new Exception("Pacientul nu exista");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return pacientAbstract;
    }
    public PacientAbstract getPacient(String nume,String nrTelefon, String adresa)
    {
        PacientAbstract pacientAbstract2=colectiePacienti.get(nrTelefon);
        if(pacientAbstract2==null)
        {
            pacientAbstract2=new Pacient(nume,nrTelefon,adresa);
            colectiePacienti.put(nrTelefon,pacientAbstract2);
        }
        return pacientAbstract2;
    }

}
