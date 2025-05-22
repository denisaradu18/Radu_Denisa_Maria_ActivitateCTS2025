package ro.cts.main;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.IPacient;
import ro.cts.clase.Pacient;
import ro.cts.clase.Salon;

public class Main {
    public static void main(String[]args) {
        FabricaPacienti fabricaPacienti = new FabricaPacienti();
        IPacient pacient1 = fabricaPacienti.getPacient("Maria", 123456789, "Str. Lalelelor");
        IPacient pacient2 = fabricaPacienti.getPacient("Ion", 987654321, "Str. Bujorilor");
        Salon salon1 = new Salon(5, 6, 12);
        Salon salon2 = new Salon(3, 8, 7);
        Salon salon3 = new Salon(4, 9, 8);

        pacient1.descriereInternare(salon1);
        pacient2.descriereInternare(salon2);

        try {
            fabricaPacienti.getPacient(123456789).descriereInternare(salon3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
