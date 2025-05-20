package cts.program;

public class Varsta {
    public boolean verificaVarsta(Persoana persoana){
        if(persoana.getVarsta()>=18) {
            System.out.println("Persoana are varsta de " + persoana.getVarsta());
            return true;
        }else{
            System.out.println("Persoana are varsta de "+ persoana.getVarsta());
            return false;
        }
    }
}
