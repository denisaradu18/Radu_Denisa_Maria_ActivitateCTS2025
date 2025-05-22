package ro.cts.clase;

public class ContCurent extends HandlerCont{
    public ContCurent(int sold) {
        super(sold);
    }

    @Override
    public void folosesteCard(float suma) {
        if(suma<sold) {
            sold=sold-suma;
            System.out.println("S a platit suma de "+suma+" din contul curent");
            System.out.println("A mai ramas suma de "+sold);
        }else {
            if(urmatorul!=null){
                urmatorul.folosesteCard(suma);
            }
        }
    }
}
