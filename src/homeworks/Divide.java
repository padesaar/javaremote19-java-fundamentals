package homeworks;

import java.util.Scanner;

/**
 * All the classes should have a method (For example: addNumbers(int[] numbers)) that takes integer number array as a parameter and do the respective operation.
 * For example: addNumbers method should add all the numbers in the given array and return the integer result.
 *
 * @author Kätlin Padesaar-Korela
 */

public class Divide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();

        System.out.println("Enter array elements on after another");

        float[] arr = new float[arrLength];

        for(int i = 0; i < arrLength; i++){
        arr[i] = scanner.nextInt();
        }

        float division= arr[0];

        for(int i = 1; i < arrLength; i++) {
            division = division / arr[i];
    }
        System.out.println("The result of elements division is: " + division);
}
}