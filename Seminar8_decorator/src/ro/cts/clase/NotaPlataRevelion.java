package ro.cts.clase;

public class NotaPlataRevelion extends PrinterFelicitare{
    public NotaPlataRevelion(Nota notaPlata) {
        super(notaPlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani!!!");
    }
}
