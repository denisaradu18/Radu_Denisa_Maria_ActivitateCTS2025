package ro.cts.main;

import ro.cts.program.*;

import javax.swing.plaf.PanelUI;

public class Main {

    public static void main(String[]args) {

        Client client1=new Client("Denisa", "0732785432","denisa@gmail.com");
        Client client2=new Client("Maria", null,"email@gmail.com");
        Client client3=new Client("Vali", null, null);

        HandlerNotificare notificareEmail=new NotificareEmail();
        HandlerNotificare notificareSMS=new NotificareSMS();
        HandlerNotificare notificareManager=new NotificareManager();

        notificareSMS.setUrmatorul(notificareEmail);
        notificareEmail.setUrmatorul(notificareManager);

        notificareSMS.notificaClient(client1,"Aveti o reducere de 15%");
        notificareSMS.notificaClient(client2,"Aveti o oferta speciala");
        notificareSMS.notificaClient(client3,"Aveti o reducere de 20%");
    }
}
