package basics;

import java.util.Scanner;

/**
 * To read two numbers from the user, add and print the result
 *
 * @author Kätlin Padesaar-Korela
 */

public class InputSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //to get input from user
        System.out.println("How many dogs you have?");
        int dogCount = scanner.nextInt(); //user answers some number

        System.out.println("How many cats you have?");
        int catCount = scanner.nextInt(); //user answers again

        System.out.println("You have " + (dogCount + catCount) + " pets");


    }
}
