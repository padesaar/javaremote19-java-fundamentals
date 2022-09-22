/**
 * Examples of Arrays
 *
 * @author Kätlin Padesaar-Korela
 */

public class Array {
    public static void main(String[] args) {


        int a = 9;

        // Arrays always start with 0

        // Single dimensional array - only one variable
        //Int array
        int[] b = {9, 27, 40, 20, 839, 11000}; //all have to be in same type

        // String array

        String[] fruits = {"apple", "orange", "mango", "apple", "banana", "mango"}; //index value 0,1,2

        // Boolean[], float[] - it can be any type

        //Java stores values in indexes, it starts from 0
        System.out.println(fruits[0]);
        System.out.println(b[4]);
      // System.out.println(fruits[3]); // Array index out of bond

        System.out.println(b.length); //return the number of values in the array

        System.out.println(b.length - 1); //returns arrays last index, -1 kuna algab ju 0ga


        //Defined arrays
       int[] veggies = new int[5];  //kui paned siia 5, saab ainult 5 values olla
        // kui [] tühjaks jätta, saab ükskõik kui palju panna

       // String[] veggies = new String[5]; //new object created in heap memory
        veggies[3] = 65; // value or element - same thing
        veggies[4] = 45;

        System.out.println(veggies[1]); // praegu iga number tähendab 0, sest see pole defineeritud array

        String[] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArray = new int[3];

        // Processing array
        // i = index of array // to process we use loop, any loop
        // conventional for-loop

        for(int i=0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // enhanced for-loop
        for(String fruit: fruits) {
            System.out.println(fruit);

        }

        // find the largest element in the array
        // Brute-force method
        int result = b[0]; //9
        for(int  x: b){
            if(x > result) {
                result = x;
            }
        }

        System.out.println(result);


        // Homework4
        // to find the smallest element in the array b
        // second homework in slack

        int result2 = b[1]; //27
        for(int  y: b){
            if(y < result2) {
                result2 = y;
            }


    }
        System.out.println(result2);


}

}
