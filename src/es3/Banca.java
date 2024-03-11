package es3;
import com.sun.tools.javac.Main;
import exepitions.BancaException;


import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class Banca {

    public static void main(String args[]) {

        Contocorrente conto1 = new Contocorrente("Grossi Mario", 20000.0);

        conto1.stampaSaldo();

        System.out.println("Saldo conto1 prima del prelievo: " + conto1.restituisciSaldo());

        try {

            conto1.preleva(1750.5);

            System.out.println("Saldo conto1 dopo il prelievo: " + conto1.restituisciSaldo());

        } catch (Exception e) {
           BancaException e1 = (BancaException) e;
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

        conto2.stampaSaldo();
        System.out.println("Saldo conto2 prima del prelievo: " + conto2.restituisciSaldo());

        try {
            conto2.preleva(200);

            System.out.println("Saldo conto dopo2 il prelievo: " + conto2.restituisciSaldo());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
