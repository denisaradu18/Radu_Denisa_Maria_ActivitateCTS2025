package ro.cts.program;

public class ProxyVanzareBilet implements IVanzareBilet{
    public IVanzareBilet vanzareBilet;

    public ProxyVanzareBilet(IVanzareBilet vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vindeBilet(String nume, int varsta) {
        if(varsta>=14){
            System.out.println("Biletul pentru persoana cu numele "+nume);
        }else {
            System.out.println("Varsta minima pentru achizitionare este 14 ani");
        }
    }
}
