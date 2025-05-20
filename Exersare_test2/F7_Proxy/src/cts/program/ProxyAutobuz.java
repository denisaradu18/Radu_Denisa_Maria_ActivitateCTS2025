package cts.program;

public class ProxyAutobuz implements IAutobuz{
    private IAutobuz autobuz;

    public ProxyAutobuz(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteAutobuz(int nrRuta, boolean existaPersone) {
        if(existaPersone){
            System.out.println("Autobuzul cu nr "+nrRuta+" opreste in statie");
        }else {
            System.out.println("Autobuzul nu are calatori si nu opreste in statie");
        }
    }
}
