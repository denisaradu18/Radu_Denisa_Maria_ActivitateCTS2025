package ro.cts.program;

public abstract class DecoratorCard implements Card{
    private Card card;

    public DecoratorCard(Card card) {
        this.card = card;
    }

    @Override
    public void  realizeazaPlati() {
        card.realizeazaPlati();
        imbunatatesteCard();
    }

    protected abstract void imbunatatesteCard();
}
