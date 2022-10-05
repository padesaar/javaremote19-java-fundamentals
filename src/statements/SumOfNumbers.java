package statements;

import java.util.Scanner;

/**
 * To find sum of numbers
 * @author Kätlin Padesaar-Korela
 */

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to sum?");
        int n = scanner.nextInt();
        int sum = 0;

        System.out.println("Enter number to sum");
        for(int i =1; i <= n; i++) { //1 sest numbrid algavad 1st
            System.out.println("Number " + i + ":");
            int input = scanner.nextInt();
            sum += input; //sum = sum + input
        }
        System.out.println("Sum: " + sum);



    }
}
