package clase;

public interface IClip {
    void adaugaClip(IClip clip) throws Exception;
    void stergeClip(IClip clip) throws Exception;
    void afiseazaClip();
    IClip getClip(int cheie) throws Exception;
}
