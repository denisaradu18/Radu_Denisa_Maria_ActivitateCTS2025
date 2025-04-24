package ro.cts.clase;

public abstract class FelMancare {
    private String ingrediente;
    private int calorii;

    public FelMancare(String ingrediente, int calorii) {
        this.ingrediente = ingrediente;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelMancare{");
        sb.append("ingrediente='").append(ingrediente).append('\'');
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }

    public  abstract void descriere();
}
