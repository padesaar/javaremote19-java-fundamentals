package calculator;

import java.util.Scanner;

/**
 *
 * Calculator
 * @author Kätlin Padesaar-Korela
 */

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULATOR");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.println("Choose any operation above:");

        int operationChoice = scanner.nextInt();

        System.out.println("How many numbers you want to operate?");
        int totalNumbers = scanner.nextInt();

        float[] inputArray = new float[totalNumbers];

        System.out.println("Enter the numbers one after another:");

        for(int i = 0; i < totalNumbers; i++){ //siin kasutame i=0 sest alustame 0 indeksist jadas
            inputArray[i] = scanner.nextFloat(); //peab siin olema, sest siis hakkab useri poolt antud numbreid loopima

        }

        float result = 0;

        switch(operationChoice) {
            case 1:
                Add add = new Add();
                result = add.addArray(inputArray); //add.addArray sest me peame saama ligi add.java-s olevale addArray-le
                break;
            case 2:
                Subtract subtract = new Subtract();
                result = subtract.subtractArray(inputArray);
                break;
            case 3:
                Multiply multiply = new Multiply();
                result = multiply.multiplyArray(inputArray);
                break;
            case 4:
                Divide divide = new Divide();
                result = divide.divideArray(inputArray);
                break;
            default:
                System.out.println("Invalid operation");
        }
        System.out.println("Result: " + result);
    }
}
