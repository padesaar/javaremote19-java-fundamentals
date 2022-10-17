package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * create 2 arrays:
 * gasolineCars
 * electricCars
 *
 * join the array
 * result will be all cars
 */

public class ConcatArrays {
    public static void main(String[] args) {

        String[] gasolineCars = {"AUDI A5, LAMBO URUS, BMW, MERCEDES s500"};
        String[] electricCars = {"TESLA MODEL 3, NISSAN LEAF, VW UP, FORD MUSTANG"};

        List<String[]> allCars = Arrays.asList(gasolineCars, electricCars);

        // second option

        String[] allCars2 = new String[gasolineCars.length + electricCars.length];
        for (int i = 0; i < gasolineCars.length; i++) {
            allCars2[i] = gasolineCars[i];

        }
        for(int i = 0; i < electricCars.length; i++) {
            allCars2[i + gasolineCars.length] = electricCars[i];
        }

        System.out.println(allCars);
        System.out.println(Arrays.toString(allCars2));

    }
}
