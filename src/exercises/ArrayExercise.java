package exercises;

/**
 * To find all pairs of elements in an array that sums to a specific number
 *
 * @author Kätlin Padesaar-Korela
 */
public class ArrayExercise {

    public static void main(String[] args) {


        int[]a = {1, 2, 7, 3, 10, 2, 9 };
        int sum = 4;

            //solution 1
        for (int i = 0; i < a.length; i++) {
            for (int c = i + 1; c < a.length; c++){
                if (a[i] + a[c] == 4) {

                    System.out.println(a[i] + " + " + a[c] + " = " +4);
                }

            }

        }
        // solution 2

        ArrayCalculator arrayCalculator = new ArrayCalculator();
        String result = arrayCalculator.findAllPairsOfSUm(a, sum);

        System.out.println(result);
    }



    }




