package strings;

import java.util.Scanner;

/**
 * to write a program to print full name from first name and last name
 *
 * @author Kätlin Padesaar-Korela
 */

public class ConcatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name");
        String lastName = scanner.nextLine();

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);



    }
}
