package ro.cts.clase;

public class Factura {
    private int numarPungi;
    private Boolean plataCuCard;
    private Boolean cardFidelitate;
    private float cotaTVA;

    protected Factura(int numarPungi, Boolean plataCuCard, Boolean cardFidelitate, float cotaTVA) {
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("numarPungi=").append(numarPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
