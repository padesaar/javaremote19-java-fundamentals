/**
 * Homework nr 5
 * Find the second largest element in an array [1, 7, 3, 10, 9]
 * @author Kätlin Padesaar-Korela
 */

public class ArrayElement {
        public static void main(String[] args) {



        int [] inArray = {1, 7, 3, 10, 9};
        int i;
        ArrayElementFinder arrayElementFinder = new ArrayElementFinder();
        String result = arrayElementFinder.findSecondLargestElement(inArray);

                System.out.println(result);

}
 }