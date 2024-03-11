package es2;

import exepitions.InvalidLiterNumber;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class.getName());
        Scanner scanner = new Scanner(System.in);
        int liters = 0;
        try {
            int kilometers;

            System.out.println("Inserisci il numero di litri: ");
            liters = scanner.nextInt();
            System.out.println("Inserisci il numero di kilometri: ");
            kilometers = scanner.nextInt();
            int calculate = liters / kilometers;
            if (liters <= 0) {
                throw new InvalidLiterNumber(liters);
            }

            System.out.println("Il numero di litri è: " + liters);
            System.out.println("Il numero di kilometri è: " + kilometers);
        } catch (InvalidLiterNumber e) {
            new InvalidLiterNumber(liters);
        } finally {
            scanner.close();
        }
    }


}
