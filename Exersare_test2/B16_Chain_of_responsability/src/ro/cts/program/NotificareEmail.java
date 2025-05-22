package ro.cts.program;

public class NotificareEmail extends HandlerNotificare{
    @Override
    public void notificaClient(Client client, String notificare) {
        if(client.getEmail()!=null){
            System.out.println("Clientul "+client.getNume()+ " a primit o notificare prin email "+notificare);
        }else {
            if(urmatorul!=null)
            {
                urmatorul.notificaClient(client,notificare);
            }
        }
    }
}
