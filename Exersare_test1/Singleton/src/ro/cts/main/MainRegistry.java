package ro.cts.main;

import ro.cts.registry.*;

public class MainRegistry {
    public static void main(String[]args){

        RegistryPachete registryPachete=RegistryPachete.getInstance();
        PachetTuristic cazare=registryPachete.inregistreazaPachet("cazare", new PachetCazare());
        PachetTuristic tarnsport=registryPachete.inregistreazaPachet("transport", new PachetTransport());
        PachetTuristic pachetTuristic=registryPachete.inregistreazaPachet("cazaretransport", new PachetCazareTransport());

        cazare.descriere();
        tarnsport.descriere();
        pachetTuristic.descriere();
    }
}
