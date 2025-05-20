package cts.program;

import java.util.List;

public class DepozitFramacie {

    private String[] stoc={"Paracetamol", "Nurofen", "Antibiotic"};

    public boolean disponibilitateMedicamente(String[] cerute){
        for(String med:cerute){
            boolean gasit=false;
            for(String disponibil:stoc){
                if(med.equals(disponibil)){
                    gasit=true;
                    break;
                }
            }
            if(!gasit){
                System.out.println("Lipsa "+med);
                return false;
            }

        }
        return true;
    }
}
