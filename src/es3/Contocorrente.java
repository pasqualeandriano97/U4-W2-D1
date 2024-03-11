package es3;

import exepitions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Contocorrente {

    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    Contocorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti);
    }

    void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
            if (saldo <= 0) {
                nMovimenti++;
                throw new BancaException("Saldo insufficiente");
            }
        }
        else {

            saldo = saldo - x - 0.50;
            nMovimenti++;
        }
    }

    double restituisciSaldo() {
        return saldo;
    }
}
