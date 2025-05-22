package ro.cts.program;

public class NotificareSMS extends HandlerNotificare{
    @Override
    public void notificaClient(Client client, String notificare) {
        if(client.getNrTelefon()!=null){
            System.out.println("Clientul "+client.getNume()+ " a primit o notificare prin sms "+notificare);
        }else {
            if(urmatorul!=null)
            {
                urmatorul.notificaClient(client,notificare);
            }
        }
    }
}
