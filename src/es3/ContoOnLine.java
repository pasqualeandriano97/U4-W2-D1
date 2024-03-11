package es3;

import exepitions.BancaException;

public class ContoOnLine extends Contocorrente {
    double maxPrelievo;

    ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {

        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo possibile: " + maxPrelievo);
    }

    void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }else{
            throw new BancaException("Prelievo non disponibile!");
        }
    }
}
