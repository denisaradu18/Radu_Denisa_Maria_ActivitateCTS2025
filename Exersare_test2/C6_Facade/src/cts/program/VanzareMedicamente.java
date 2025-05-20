package cts.program;

public class VanzareMedicamente {
    private CardSanatate cardSanatate=new CardSanatate();
    private DepozitFramacie depozitFramacie=new DepozitFramacie();
    private Reteta reteta=new Reteta();

    public void vindeMedicament(Client client){
        if(!cardSanatate.esteValid(client)){
            System.out.println("Card invalid");
            return;
        }
        if(!depozitFramacie.disponibilitateMedicamente(client.getMedicamente())){
            System.out.println("Stoc insuficient");
            return;
         }
         if(!reteta.verificaReteta(client)){
             System.out.println("Reteta nu este disponibila");
             return;
         }

        System.out.println("Medicamente eliberate pentru "+ client.getNume());

    }
}
