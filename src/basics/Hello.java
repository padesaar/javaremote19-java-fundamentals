package basics;


import java.util.Scanner;

/**
 * To get input from user and print it
 *
 * @author Kätlin Padesaar-Korela
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Welcome to my first exercise!");

        Scanner scanner = new Scanner(System.in); //scanner - to get te input from user
        System.out.println("Enter your name:");
        String name = scanner.nextLine(); //nextLine used for string

        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age:");
        int age = scanner.nextInt(); //nextInt used for number

        System.out.println("Do you live in Tallinn?");
        boolean isLivingTallinn = scanner.nextBoolean();

        System.out.println("Age is" + age);
        System.out.println("Am I living in Tallin" + isLivingTallinn);


    }
}
