package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * write a program that does the following (the code should be in separathe methods
 * <p>
 * generate d an array with 10 elements random between 0 and 99 (see random class java)
 * <p>
 * display the generated array
 * display only the odd numbers
 * display only the even numbers
 */

public class RandomEven {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 99;
        final int arrayLimit = 10;

        int[] array = new int[arrayLimit];

        // task 1
        for (int i = 0; i < arrayLimit; i++) {
            array[i] = getRandomNumber(min, max);

        }
        System.out.println("Random array");
        displayArray(array);

        displayOddArray(array);
        displayEvenArray(array);


    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;

    }

    private static void displayArray(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));

    }

    private static void displayOddArray(int[] inputArray) {
        List<Integer> oddArrayList = new ArrayList<>(); //kuna ei tea mitu peaks olema jadas, siis paneme list

        for (int number : inputArray) {
            if (number % 2 != 0) {
                oddArrayList.add(number);
            }
        }
        System.out.println("Odd numbers of the array:");
        displayArray(convertListToArray(oddArrayList));

    }

    private static int[] convertListToArray(List<Integer> intList) {
        int[] result = new int[intList.size()];

        for (int i = 0; i < intList.size(); i++) {
            result[i] = intList.get(i);
        }
        return result;
    }

    private static void displayEvenArray(int[] inputArray) {
        List<Integer> evenArrayList = new ArrayList<>(); //kuna ei tea mitu peaks olema jadas, siis paneme list

        for (int number : inputArray) {
            if (number % 2 == 0) {
                evenArrayList.add(number);
            }
        }

        System.out.println("Even numbers of the array:");
        displayArray(convertListToArray(evenArrayList));
    }
}
//display array

// to print odd numbers of array

//to print even numbers of array