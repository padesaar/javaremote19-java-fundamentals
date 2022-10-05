package homeworks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * To read a number from user and print the same number like this:
 * the given number is 4 (print 4 times)
 * 4, 44, 444, 4444
 *
 * @author Kätlin Padesaar-Korela
 */

public class IntegerDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int givenNumber = scanner.nextInt();


     for(int i = 1; i <= givenNumber; i++){ //loop inside loop eg nested loop 1 loop for number of times
         for(int j = 1; j <= i; j++) {// is to print the number og digits
         System.out.print(givenNumber);
       }
        System.out.println(); //or võib sulgudesse panna (", ")
    }

        for(int i = givenNumber; i >= 1; i--){ //loop inside loop eg nested loop 1 loop for number of times
            for(int j = i; j >= 1; j--) {// is to print the number og digits
                System.out.print(givenNumber);
            }
            System.out.println(); //or võib sulgudesse panna (", ")
        }

}
}