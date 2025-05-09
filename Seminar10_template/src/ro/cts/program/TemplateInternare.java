package ro.cts.program;

public abstract class TemplateInternare {
   public final void internare(Pacient pacient){
        if(anlalizaPacient(pacient)<3)
        {
            System.out.println("Nu necesita internare");
        }else{
            verificareDisponibilitate();
            emiteFisa(pacient);
        }
    }

    abstract int anlalizaPacient(Pacient pacient);
    abstract  void verificareDisponibilitate();
    abstract void emiteFisa(Pacient pacient);
}
