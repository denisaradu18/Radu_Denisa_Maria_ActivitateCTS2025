package ro.cts.clasa;

public class ContBanca implements ContPrototype{
    private String nume;
    private double suma;
    private String valuta;

    public ContBanca(String nume, double suma, String valuta) {
        this.nume = nume;
        this.suma = suma;
        this.valuta = valuta;
    }

    public ContBanca() {
        this.nume="Anonim";
        this.suma=0;
        this.valuta="Necunoscuta";
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBanca{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", suma=").append(suma);
        sb.append(", valuta='").append(valuta).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ContPrototype clone() {
        ContBanca contBanca=new ContBanca();
        contBanca.nume=this.nume;
        contBanca.suma=this.suma;
        contBanca.valuta=this.valuta;
        return contBanca;
    }
}
