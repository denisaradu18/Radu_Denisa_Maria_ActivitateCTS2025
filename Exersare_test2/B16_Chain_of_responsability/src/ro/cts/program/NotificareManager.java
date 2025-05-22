package ro.cts.program;

public class NotificareManager extends HandlerNotificare{
    @Override
    public void notificaClient(Client client, String notificare) {
        if(client.getNrTelefon()==null & client.getEmail()==null){
            System.out.println("Mesaj pentru manager: clientul nu are date disponibile pentru a i se trimite notificari");
        }
    }
}
