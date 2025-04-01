package classes;

public class FabricaMedicamente {

    public FabricaMedicamente() {
    }

    public Medicament getMedicament(Categorii categorii, String denumire, float pret)
    {
        switch (categorii){
            case BODY -> {
                Body medicamentBody=new Body(denumire, pret);
                return medicamentBody;
            }
            case DURERE -> {
                Durere medicamentDurere=new Durere(denumire,pret);
                return medicamentDurere;
            }
            case RACEALA -> {
                Raceala medicamentRaceala=new Raceala(denumire,pret);
                return medicamentRaceala;
            }
            default -> {
                return null;
            }
        }
    }
}
