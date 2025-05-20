package ro.cts.program;

public class ContactLess extends DecoratorCard{

    public ContactLess(Card card) {
        super(card);
    }

    @Override
    protected void imbunatatesteCard() {
        System.out.println("Se poate realiza plata cu cardul contactless");
    }


}
