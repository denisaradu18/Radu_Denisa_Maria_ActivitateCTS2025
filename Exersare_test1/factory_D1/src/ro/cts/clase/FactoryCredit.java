package ro.cts.clase;

public class FactoryCredit {
    public Credit getProdus(TipCredit tipCredit, String numeClient, String valuta, double valoare){
        switch (tipCredit){
            case NevoiPersonale -> {
               return new CreditNevoiPersonale(numeClient,valuta,valoare);
            }
            case Ipotecare -> {
                return new CreditIpotecar(numeClient,valuta,valoare);
            }
            default -> {
                return null;
            }

        }
    }


}
