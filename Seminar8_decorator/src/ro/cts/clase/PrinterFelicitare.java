package ro.cts.clase;

public abstract class PrinterFelicitare  implements Nota {
    private Nota notaPlata;

    public PrinterFelicitare(Nota notaPlata) {
        this.notaPlata = notaPlata;
    }


    @Override
    public void printare() {
        notaPlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
