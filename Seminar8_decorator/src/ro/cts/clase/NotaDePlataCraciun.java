package ro.cts.clase;

public class NotaDePlataCraciun extends PrinterFelicitare{
    public NotaDePlataCraciun(Nota notaPlata) {
        super(notaPlata);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun Fericit");
    }
}
