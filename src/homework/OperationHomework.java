package homework;

/**
 * My first Homework
 *
 * @author Kätlin Padesaar-Korela
 */

public class OperationHomework {
    public static void main(String[] args) {

        int a = 7;
        int b = 19;
        int c = 5;
        int x = -3;
        int y = 0;
        int k = 9;

        float p = x * a - (y + b * c) % k;


        // Complex expression step-by-step
        // 1. First is between the brackets ( y + b * c), and first here is b * c and then + y // 0 + 19 * 5 = 95
        // 2. Then it's x * a then we substract from that result the result from the brackets // -21 - 95 % k
        // 3. Then it's -95 % k because % has higher priority than substraction // result = -5
        // 4. Then it's -21 - 5 = -26

        System.out.println(p);




    }
}
