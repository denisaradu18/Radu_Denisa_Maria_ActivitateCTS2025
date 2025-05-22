package clase;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements IClip{
    private List<IClip> listClipuri;
    private String nume;
    private int nrClipuri;

    public PlayList( String nume, int nrClipuri) {
        this.listClipuri = new ArrayList<>();
        this.nume = nume;
        this.nrClipuri = nrClipuri;
    }

    @Override
    public void adaugaClip(IClip clip) throws Exception {
        listClipuri.add(clip);
    }

    @Override
    public void stergeClip(IClip clip) throws Exception {

        listClipuri.remove(clip);
    }

    @Override
    public void afiseazaClip() {
        for(IClip clipuri:listClipuri){
            clipuri.afiseazaClip();
        }

    }

    @Override
    public IClip getClip(int cheie) throws Exception {
        return listClipuri.get(cheie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlayList{");
        sb.append("listClipuri=").append(listClipuri);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrClipuri=").append(nrClipuri);
        sb.append('}');
        return sb.toString();
    }
}
