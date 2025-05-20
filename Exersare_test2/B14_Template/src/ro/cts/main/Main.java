package ro.cts.main;

import ro.cts.program.Masa;
import ro.cts.program.MasaRestaurant;
import ro.cts.program.TemplateMasa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(false, false, 3); // masă care nu e curățată și fără șervețele

        TemplateMasa masaRestaurant = new MasaRestaurant();
        masaRestaurant.ocupaMasa(masa);
    }

}
