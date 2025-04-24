package ro.cts.clase;

public class FactoryPersoanaJuridica implements FactoryClient{
    @Override
    public Client creazaClient(String nume, Double valoare) {
        return new PersoanaJuridica(nume, valoare);
    }
}
