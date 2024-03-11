import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

import java.util.Random;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[5];
      for (int i = 0; i < 5; i++) {
          Random random = new Random();
          arrayOfNumbers[i] = random.nextInt(1,10);
          System.out.println(arrayOfNumbers[i]);
      }
      int number = 0;
      int index = 0;

      do {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Inserisci l'indice dell'array a cui modificare il numero: ");
          index = scanner.nextInt();
          Scanner scanner2 = new Scanner(System.in);
          System.out.println("Inserisci il nuovo numero: ");
          number = scanner2.nextInt();
          arrayOfNumbers[index] = number;

          for (int i = 0; i < arrayOfNumbers.length; i++) {
              System.out.println(arrayOfNumbers[i]);
          } if((number<1||number>10)||(index<=0||index>5)){ log.error("Errore:Il numero o l'indice non sono validi");}
      }while(number!=0);


}};