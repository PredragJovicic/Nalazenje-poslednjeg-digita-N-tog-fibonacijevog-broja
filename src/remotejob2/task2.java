package remotejob2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pedja on 10-Jan-18.
 *
 Objasnjenje:
 Ulaz je uradjen preko klase Scanner. Po unosu provera se dali je broj veci od nule, ako jeste poziva se metoda getNumbersList(input)
 koja izracunava trazeni broj. Metod radi tako sto kreira niz numbers koji ima dva clana 0 i 1, koji imaju vrednost prva dva clana
 fibonacijev niza - zato for petlja krece od indeksa 2. Na osnovu njih se racuna sledeci fibonacijev broj kao res = number1 + number
 i zatim se niz setuje tako sto se res stavlja na poziciju sa indeksom 1 a predhodni n-1 broj zauzima mesto sa indeksom 0 - pomera se
 na levo. For petlja tako racuna sve do trazenog fibonacijevo broja a u nizu se nalaze samo dva clana. Poslednji
 digit moze da se racuna na dva nacina. Prevede se u string pa se nadje duzina stringa i onda se preko naredbe
 substring(duzina Stringa umanjena za jedan) nadje poslednji digit. Drugi nacin je preko number % 10 moduo broja podeljen sa deset.
 Za izlazak pritisnite bilo koji slovni taster

 *
 */


public class task2 {

    private static int getNumbersList(int value){

        int res =0;
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);

        if (value == 1){
            res = 1;
        }else if(value == 2){
            res = 1;
        }else {
            for (int i = 2; i < value; i++) {

                int number1 = numbers.get(0);
                int number2 = numbers.get(1);
                res = number1 + number2;
                numbers.set(0, number2);
                numbers.set(1, res);

            }
        }
        return res;
    }

    public static void main(String[] args) {

        for(;;) {
            System.out.println("Enter number:");
            Scanner in = new Scanner(System.in);

            try {

                int input = in.nextInt();
                task2 task2 = new task2();

                if (input < 1) {
                    System.out.println("Fibonnaci number not exist");
                } else {
                    int number = task2.getNumbersList(input);
                    //number = Math.abs(number % 10);

                    String lastdigit = new String(""+number);
                    lastdigit = lastdigit.substring(lastdigit.length() - 1);
                    System.out.println("Last digit :" + lastdigit);
                }

            } catch (Exception e) {
                System.out.println("Number is not integer");
                break;
            }
        }

    }
}
