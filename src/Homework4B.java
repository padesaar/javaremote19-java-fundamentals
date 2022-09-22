/**
 * Homework 2 and 3 for arrays class
 *
 * @author Kätlin Padesaar-Korela
 */

public class Homework4B {
    public static void main(String[] args) {

        // Homework 4-2
    int i, total;
    int[]a = {1, 7, 3, 10, 9};

        System.out.println(a.length); //length is 5

        int b = 5;

        total = 0;

        for(i = 0; i < b; i++) {
            total += a[i];


        }

        System.out.println("Average" + total/(float)b);

        // Homework 4-3
        //   int[]a = {1, 7, 3, 10, 9};


       for (int c = 0; c < a.length; c++){
           System.out.println(a[c] + " ");
       }
        // reverse order

        for (int c = a.length-1; c >= 0; c--) {
            System.out.println(a[c] + " ");
        }
    }
}
