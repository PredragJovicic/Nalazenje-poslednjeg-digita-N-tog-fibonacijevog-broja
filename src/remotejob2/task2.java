package remotejob2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
