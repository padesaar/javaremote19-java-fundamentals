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
        for(int  f: b){
            if(f > result) {
                result = f;
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

        // Multi-dimensional array

        // int [][] - 2D array


        int[][] array2d = new int[3][3]; // this can hold 9 values, 3 rows and 3 columns
        // 3 is x value and 3 is y value
        // we have only 1 table (vaata 3D)

        //row 1
        array2d[0][0] = 1;
        array2d[0][1] = 0;
        array2d[0][2] = 1;

        //row 2

        array2d[1][0] = 2;
        array2d[1][1] = 10;
        array2d[1][2] = 9;

        //row 3

        array2d[2][0] = 4;
        array2d[2][1] = 9;
        array2d[2][2] = 8;

        int[][] array2dver2 = { {1, 0, 1}, {2, 10, 9}, {4, 9, 8}};

        for(int x = 0; x < 3; x++) {
          for(int y = 0; y < 3; y++) {
                System.out.print(array2dver2[x][y] + " ");
        }
            System.out.println();
        }

       // 3 dimensional array 3D (1D + 2D array)
        // 1D represents number of tables
        // 2D represents array with rows and columns

        int[][][] array3d = new int[3][3][3]; // [] esimene nt mitu tabelit on, teine mitu rows ja kolmas mitu columns are
        //table 1
        // row 1
        array3d[0][0][0] = 1;
        array3d[0][0][1] = 0;
        array3d[0][0][2] = 1;

        array3d[2][1][2] = 7;


        // there are brackets for each table and each row
        int[][][] array3dver2 = { {
                {1, 0, 1}, {1, 8, 0}, {2, 5, 7} },
                { {9, 8, 7}, {5, 8, 9}, {3, 5, 0}},
                { {5, 6, 2}, {4, 5, 7}, {2, 6, 8}}
        };


        System.out.println("\n");
        for(int w = 0; w < 3; w++) {
            for(int s = 0; s < 3; s++) {
                for(int g = 0; g < 3; g++) {
                System.out.print(array3dver2[w][s][g]+ "\t");

            }
            System.out.println();
        }
        System.out.println("\n\n");

        }
}

}
