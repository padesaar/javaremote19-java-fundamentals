package strings;

import java.util.Scanner;

/**
 * to write a Java program to change string to upper case
 *
 * @author Kätlin Padesaar-Korela
 */

public class Capitalize {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());

    }
}
