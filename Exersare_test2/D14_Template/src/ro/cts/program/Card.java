package ro.cts.program;

public class Card {
    private int nrCard;
    private String numeTitular;

    public Card(int nrCard, String numeTitular) {
        this.nrCard = nrCard;
        this.numeTitular = numeTitular;
    }

    public int getNrCard() {
        return nrCard;
    }

    public String getNumeTitular() {
        return numeTitular;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("nrCard=").append(nrCard);
        sb.append(", numeTitular='").append(numeTitular).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
