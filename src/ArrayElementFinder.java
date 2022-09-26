/**
 * Find the second largest element in an array - finder
 *
 * @author Kätlin Padesaar-Korela
 */

public class ArrayElementFinder {
    public String findSecondLargestElement(int[] inArray) {
      String result = " ";

        for (int i = 0; i < inArray.length; i++) {
            for (int b = i+1; b < inArray.length; b++){
                if(inArray[i] < inArray[b]) {

                    int temp = inArray[i];
                    inArray[i] = inArray[b];
                    inArray[b] = temp;

                    result = "The second largest element in an array is " + inArray[1];
                }
            }

        }

        return result;
       }

    }



