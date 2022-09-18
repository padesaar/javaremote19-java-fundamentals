/**
 * Examples for Java operators
 *
 * @author Kätlin Padesaar-Korela
 */

public class Operator {


    public static void main(String[] args) {

       // Unary operators (operator with 1 variable)
        int i = 0;

        System.out.println(i);

        System.out.println(i++); // value is still 0
        i++; // i + 1 // (incremented value plus another increment)

        System.out.println(i);

        // post-decrement

        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        // pre-decrement

        int j = 10;
        System.out.println(j);
        System.out.println(--j);

        // brackets are the highest priority
        int x = i + (-j); // sulgudes asja lahendab esimesena, x = i - j ehk 2 - 9 = -7

        System.out.println(x);

        // Binary operators (operator with 2 variables)
        // arithmetic operators

        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b; // multiplication has the highest priority, ehk korrutab läbi kõigepealt
        System.out.println(d);

        float z = i * a + (c / b) - (-j) % x; // priority is given to unary operation
        /* kui panna int floati asemele, siis kaotame kõik decimal punktid ära
        1. z = i * a (c / b) +  j % x;
        2. z = (c / b);
        3. z = multiplication *
        4. z = %
        This is complex expression step-by-step
         */
        System.out.println(z);

        int divide = 40 / 5; // quotient value
        System.out.println(divide);

        int module = 40 % 7; // reminder value (mitu 7 mahub 40 sisse ja see, mis üle jääb on vastus, 7*5 = 35 ja 40-35 = 5
        System.out.println(module);

        // Comparsion operators (==; !=; >, <, >=, <=)
        // always compare the same data types

        boolean result = divide == module; // 8 == 5
        System.out.println(result);

        boolean result2 = divide != module; // 8 ei võrdu 5;  not equals on !=
        System.out.println(result2);

        boolean lessCheck = divide < module; // 8 < 5
        System.out.println(lessCheck);

        boolean greaterCheck = divide > module; // 8 > 5
        System.out.println(greaterCheck);

        //less than or equals
        boolean lessEquals = divide <= module; // 8 <= 5
        System.out.println(lessEquals);

        //Logical operators (&& - and , || / or)
        /*
          true and false = false
          false and false = false
          false and true = false
          true and true = true
         */

        boolean andCheck = (8 < 9) && (10 > 4);
        System.out.println(andCheck);

        /*
           true || true = true
           false || false = false
           true || false = true
           false || true = true
         */

        boolean orCheck = (8 > 9) || (10 > 4);
        System.out.println(orCheck);


        /* ^  xAnd, xOr
        //0 = 00000000;
        //1 = 00000001; /*predescribed values in java
        //2 = 00000010;
        //3 = 00000011;
        //4 = 00000100;
        //5 = 00000101;
        //6 = 00000110;
        //7 = 00000111;
        //8 = 00001000;
        //9 = 00001001;
        //10 = 00001010;
        //11= 00001011;
        //12 = 00001100;

        0 = false
        1 = true


        true ^ false = true;
        false ^ true = true;
        true ^ true = false;
        false ^ false = false;
         */

        float expo = 12 ^ 25; // 12 = 00001100, 25 = 00011001
        System.out.println(expo);

        //Assigment operators
        x = x + y; // both are same
        x += y;
        x /= y;
        x *= y;

        // Ternary operators (?, :)
        String ternary = (x > y) ? "Cat" : "Dog"; // see on true, siis prindib cat ja kui false, siis dog
        System.out.println(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        int check2 = !lessCheck ? 9 : 10;

        // number comparsion
        boolean checkNumber = 9 == 9.0; // comparing int == false, java loeb nulli komakohana ikka täisarvuks
        System.out.println(checkNumber);
        boolean checkNumber2 = 9 == 9.3335;
        System.out.println(checkNumber2);

        //mostly used operators
        // ++, --
        // +
        // ==, !=
        // &&, ||
        // ?, :


    }
}
