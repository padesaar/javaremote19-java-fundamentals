package examples;

import java.time.*;
import java.time.LocalDateTime;
import java.util.*; //* is called as wildcard
import java.util.Random; // kui random asemele panna * siis pole vaja uuesti importida, võtab alati sealr edaspidi

/**
 * Package examples
 *
 * @author Kätlin Padesaar-Korela
 */

public class PackageExample {
    public static void main(String[] args) {

        Random random = new Random(); //after this line ues small letter random eg object name
        System.out.println(random.nextInt());

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate myBirthday = LocalDate.of(1989, 11, 23);
        System.out.println(myBirthday);




    }
}
