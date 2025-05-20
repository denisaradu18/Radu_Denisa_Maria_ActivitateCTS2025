package cts.program;

public class Credit implements ICredit{
    @Override
    public void creareCont(String nume, String moneda) {
        System.out.println("Clientul cu numele "+nume+ "are un cont in moneda "+moneda);
    }
}
