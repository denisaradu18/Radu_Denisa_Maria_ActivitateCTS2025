package ro.cts.program;

public class Banca extends TemplateRetragereBancara{
    @Override
    public void introduceCardul(Card card) {
        System.out.println("Cardul a fost introdus de "+card.getNumeTitular());
    }

    @Override
    public void intorducePinul(Card card) {
        System.out.println("Introduceti pinul cardului");
    }

    @Override
    public void specificaSuma() {
        System.out.println("Specificati suma pe care doriti sa o extrageti");
    }

    @Override
    public void retrageBaniiDinBancomat(Card card) {
        System.out.println("Banii sunt exatrasi din bancomat ");
    }

    @Override
    public void retrageCardul(Card card) {
        System.out.println("Retrageti cardul din bancomat");

    }
}
