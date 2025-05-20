package cts.program;

public class ProxyCredit implements ICredit{
    private ICredit credit;

    public ProxyCredit(ICredit credit) {
        this.credit = credit;
    }
    @Override
    public void creareCont(String nume, String moneda) {
        if(moneda=="RON"){
            System.out.println("Contul a fost creat");
        }
        else{
            System.out.println("Acceptam credite doar in RON");
        }
    }
}
