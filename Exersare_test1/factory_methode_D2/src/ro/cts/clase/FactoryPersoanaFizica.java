package ro.cts.clase;

public class FactoryPersoanaFizica implements FactoryClient{

    @Override
    public Client creazaClient(String nume, Double valoare) {
        return new PersoanaJuridica(nume,valoare);
    }
}
