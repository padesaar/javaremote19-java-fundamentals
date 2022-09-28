package exercises;

/**
 * Swap two variables exercise
 *
 * @author Kätlin Padesaar-Korela
 */

public class SwapExcercise {
    public static void main(String[] args) {

        int a = 15;
        int b = 25;
        int temp;

        System.out.println("a:" + a + " b:" + b);

        temp = a;  //temp = 15
        a = b; // now a = 25
        b = temp; // b = 15
        System.out.println("a:" + a + " b:" + b);

        //clear garbage collection(optional thing here)
        System.gc();

    }
}
