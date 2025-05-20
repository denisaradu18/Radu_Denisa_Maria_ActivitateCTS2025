package ro.cts.program;

public abstract class TemplateMasa {
   public void ocupaMasa(Masa masa){
     if(!masa.isEsteCuratata()){
         curataMasa(masa);
         if(!masa.isAreServetele()){
             aseazaServetele(masa);
             invitaPersoaneleLaMasa();
         }else {
             System.out.println("Masa nu este aranjata");
         }
     }else{
         System.out.println("Masa nu este curatata");
     }
   }
   public abstract boolean curataMasa(Masa masa);
   public abstract boolean aseazaServetele(Masa masa);
   public abstract void  invitaPersoaneleLaMasa();

}
