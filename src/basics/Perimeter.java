package basics;

import java.util.Scanner;

/**
 * Calculate the area and perimeter of a circle
 * Area = Pi radius sq
 * Perimeter = 2 Pi radius
 *
 * @author Kätlin Padesaar-Korela
 */

public class Perimeter {
    public static void main(String[] args) {

        final float pi = 3.14f; //constant value
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        float radius = scanner.nextFloat();

        // calculate area of the circle
        float area = pi * (radius * radius);

        // perimeter (circumference)
        float perimeter = 2 * pi * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);


    }
}
