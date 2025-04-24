package ro.cts.clase;

public class FacturaBuilder implements  AbstractBuider{
    private int numarPungi;
    private Boolean plataCuCard;
    private Boolean cardFidelitate;
    private float cotaTVA;

    public FacturaBuilder() {
        numarPungi=0;
        plataCuCard=false;
        cardFidelitate=false;
        cotaTVA=0;
    }

    public FacturaBuilder setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
        return this;
    }

    public FacturaBuilder setPlataCuCard(Boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
        return this;
    }

    public FacturaBuilder setCardFidelitate(Boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
        return this;
    }

    public FacturaBuilder setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
        return this;
    }

    @Override
    public Factura build() {
        return (new Factura(numarPungi,plataCuCard,cardFidelitate,cotaTVA));
    }
}
