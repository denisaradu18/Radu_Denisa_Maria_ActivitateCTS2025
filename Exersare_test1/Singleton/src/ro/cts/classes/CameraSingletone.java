package ro.cts.classes;

public class CameraSingletone {
    private static CameraSingletone instance;
    private float dimensiune;
    private int nrCamere;

    private CameraSingletone(float dimensiune, int nrCamere) {
        this.dimensiune = dimensiune;
        this.nrCamere = nrCamere;
    }

    public synchronized static CameraSingletone getInstance(float dimensiune, int nrCamere)
    {
        if(instance==null)
        {
            instance=new CameraSingletone(dimensiune, nrCamere);
        }
        return  instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CameraSingletone{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append(", nrCamere=").append(nrCamere);
        sb.append('}');
        return sb.toString();
    }
}
