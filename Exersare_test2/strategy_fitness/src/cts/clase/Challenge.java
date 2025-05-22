package cts.clase;

public class Challenge implements IChallenge{
    private ITipExercitiu tipExercitiu;
    private String nume;

    public Challenge(ITipExercitiu tipExercitiu, String nume) {
        this.tipExercitiu = tipExercitiu;
        this.nume = nume;
    }

    @Override
    public void startChallenge() {
        System.out.println("Challenge pentru "+nume);
        for(int i=1;i<=100;i++){
            System.out.println("Exercotiul "+i+" : ");
            tipExercitiu.executa();
        }

    }

    public void setTipExercitiu(ITipExercitiu tipExercitiu) {
        this.tipExercitiu = tipExercitiu;
    }

}
