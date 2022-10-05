package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * To reverse a given array
 *
 * @author Kätlin Padesaar-Korela
 */

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrLength = scanner.nextInt();

        System.out.println("Enter array elements on after another");

        int[] arr = new int[arrLength];
        int [] reverseArr = new int [arrLength];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println("Input array is " + Arrays.toString(arr)); //toString converts array to string

        int j = 0;
        for (int i = arrLength - 1; i >= 0; i--){
            //create reverse array
            reverseArr[j] = arr[i]; //0 element = element 4 and so on
            j++;
        }
        System.out.println("Reverse array is" + Arrays.toString(reverseArr));
    }
}
