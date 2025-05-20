package ro.cts.program;

public abstract class TemplateRetragereBancara {

    public  abstract void introduceCardul(Card card);
    public abstract void intorducePinul(Card card);
    public abstract void specificaSuma();
    public abstract void retrageBaniiDinBancomat(Card card);
    public abstract void retrageCardul(Card card);

    public final void retaregerBancara(Card card){
        introduceCardul(card);
        intorducePinul(card);
        specificaSuma();
        retrageBaniiDinBancomat(card);
        retrageCardul(card);

    }

}
