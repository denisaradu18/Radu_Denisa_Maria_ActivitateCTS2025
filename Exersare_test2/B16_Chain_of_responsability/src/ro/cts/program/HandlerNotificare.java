package ro.cts.program;

public abstract class HandlerNotificare {
    protected HandlerNotificare urmatorul;

    public void setUrmatorul(HandlerNotificare urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void notificaClient(Client client, String notificare);
}
