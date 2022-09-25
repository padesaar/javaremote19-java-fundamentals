import java.util.Arrays;

/**
 * Homework5
 *
 * @author Kätlin Padesaar-Korela
 */


public class Homework5 {
    public static void main(String[] args) {

        System.out.println("Task 1");
        // First task: Write a Java program to print all odd numbers from array [1, 7, 3, 10, 9]

        int[]num = {1, 7, 3, 10, 9 };



       for (int i= 0; i < num.length; i++) {

          if (num[i] % 2 != 0 ) {
              System.out.println(num[i]);


           }


       }
        System.out.println("Task 2");
       // Task 2: Write a Java program to find the number of even and odd integers form an array of integers [1, 7, 3, 10, 9]


        int[]a = {1, 7, 3, 10, 9 };
        int n = a.length;
        System.out.println(a.length);

        int c = 0;
        for (int i = 0; i < a.length; i++){

        if(a[i] % 2 == 0)
            c++;
        }

        System.out.println("Number of even integers : "+c);
        System.out.println("Number of odd integers : "+(a.length-c));

        System.out.println("Task 3");



        // Task 3: Write a Java program to find the duplicate values of of an array of integer values [1, 7, 3, 7, 10, 1, 9]

            int[]g = {1, 7, 3, 7, 10, 1, 9};

            for(int i = 0; i < g.length-1; i++) {

                for(int r = i+1; r < g.length; r++) {

                    if ((g[i] == g[r]) && (i != r)){
                        System.out.println("Duplicate value : " +g[r]);
                    }
                }
            }

        }


           }










