package cts.clase;

public class Medic {
   public boolean confimareMedic(Pacient pacient){
       System.out.println("Medicul analizeaza starea paicentului");
       return pacient.isStareGrava();
   }
}
