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


        // if
        // Write a Java program to find if the person is adult (adult age is 18)

        int myAge = 21;
        if(myAge >= 18) {
            System.out.println("Person is an adult");
        } else {
            System.out.println("Person is not an adult");
        }

        // if else
        // Write a Java program to print if the given number is odd or even
        // two conditions odd or even
        int number = 2012;

        if(number % 2 == 0){
            System.out.println("This is an even number");
        } else {
            System.out.println("This is odd number");
        }

        // if, else-if, else
        // more than two conditions
        // Write a Java program to print if the string is empty, if the length is greater than 20 and if the string is null

        String test = " ";
        if(test == " ") {
            System.out.println("The given string is empty");

        } else if (test.length() > 20){
            System.out.println("The given string is so long");
        } else if(test.length() < 20){
            System.out.println("The given string is too short");
        } else if (test == null){
            System.out.println("The given string is null");
        }

        //Switch
        //Write a Java program to match the given alphabet
        char test2 = 'A';

        switch(test2) {
            case 'A':
                System.out.println("The given alphabet is A");
                break;
            case 'B':
                System.out.println("The given alphabet is B");
                break;
            case 'K':
                System.out.println("The given alphabet is K");
                break;
            default:
                System.out.println("The given alphabet is not found");
        }

        // extra exercise
        // for or while loop
        // Write a Java program to print all the odd numbers from 1-50


        int h = 1;
        for (; h <= 50; h++) {
            if(h % 2 !=0){
            System.out.println(h + " is odd number");
        }




}
}
}