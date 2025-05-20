package cts.program;

public class Autobuz implements IAutobuz{
    @Override
    public void opresteAutobuz(int nrRuta, boolean existaPersone) {
        System.out.println("Autobuzul de noapte cu ruta cu numarul "+nrRuta);
    }
}
