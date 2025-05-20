package ro.cts.program;

public class CradSimplu implements Card{
    private String titular;

    public CradSimplu(String titular) {
        this.titular = titular;
    }

    @Override
    public void  realizeazaPlati() {
        System.out.println("Clientul "+ titular+ " a realizat o plata cu cardul online sau normal ");
    }
}
