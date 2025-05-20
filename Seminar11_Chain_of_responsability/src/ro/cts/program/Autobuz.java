package ro.cts.program;

public class Autobuz extends InfoMijloc{
    @Override
    public void recomandaMijloc(int distanta) {
        if (distanta < 5){
            System.out.println("Calatorul va lua autobuzul");
        }
        else {
            this.getUrmMijloc().recomandaMijloc(distanta);
        }
    }
}