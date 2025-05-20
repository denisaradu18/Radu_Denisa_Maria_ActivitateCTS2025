package cts.clase;

public class FacadeInternare {
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }
    public void interneazaPacient(Pacient pacient){
        if(!pacient.isStareGrava()){
            System.out.println("Pacientul "+ pacient.getNume()+ " nu este in stare grava.Nu necesita internarea");
            return;
        }
        if(!medic.confimareMedic(pacient))
        {
            System.out.println("Medicul a confirmat internarea pacientului "+pacient.getNume());
        }

        if(!salon.arePaturiLibere()){
            System.out.println("Nu exista patru libere pentru pacientul"+pacient.getNume());
            return;
        }
        salon.ocupaPrimulPatLiber();
        System.out.println("Paceintul "+pacient.getNume()+"a fost internat cu suuces");
    }
}
