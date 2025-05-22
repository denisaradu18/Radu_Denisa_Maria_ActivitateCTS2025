package ro.cts.clase;

public class ContCredit extends HandlerCont{
    public ContCredit(int sold) {
        super(sold);
    }

    @Override
    public void folosesteCard(float suma) {
        if(suma<sold){
            sold=sold-suma;
            System.out.println("S a platit suma de "+suma+" din cotul de credit");
            System.out.println("A mai ramas in cont soldul de "+sold);
        }
        else {
            System.out.println("Nu s a putut realiza plata");
        }
    }
}
