package exercises;

/**
 * examples.Statement Exercises
 *
 * @author Kätlin Padesaar-Korela
 */

public class StatementsExercises {
    public static void main(String[] args) {

        int i; // i can be whatever number you need to find answer to
        // solution 1 using if-else

        for(i=0; i <= 20; i++){

        if(i % 2 == 0) { //if  you want to find the multiplier 2 you should use module, if it is dividebale by 2 it should give 0
            System.out.println(i + "This is even number");
        } else {
            System.out.println(i + "This is odd number");
        }

        }

        // solution 2 is using ternary operator
         for (i = 0; i <= 20; i++) {
             System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd") + " number ");
            //i is even or odd number
         }

         // Leap Year

        // solution 1
        int year = 2022;

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
            System.out.println(year + " is a leap year ");
    } else {
            System.out.println(year + " is not a leap year ");
        }

        // solution 2

        System.out.println(year + " is " + (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)  ? " " : " not ") + " a leap year ");

        // solution 3 simple

        if (year % 4 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }

        // FizzBuzz
        // Solution 1

        int j = 15;
        if(j % 3 == 0 && j % 5 == 0) {
            System.out.println("FizzBuzz");

        } else if (j % 5 == 0) {
            System.out.println("Buzz");

        } else if (j % 3 == 0) {
            System.out.println("Fizz");
        }

        // Solution 2
        // one line operation (homework3)


        System.out.println((j % 3 == 0 && j % 5 == 0) ? "FizzBuzz" : ((j % 3 == 0) ? "Fizz" : ((j % 5 == 0) ? "Buzz" : j + " ")));


        }
}