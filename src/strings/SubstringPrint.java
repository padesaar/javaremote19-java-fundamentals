package strings;

/**
 * to print a substring of a string
 *
 * @author Kätlin Padesaar-Korela
 */

public class SubstringPrint {
    public static void main(String[] args) {

        String s = "Estonia is a beautiful country!";
        System.out.println(s);

        System.out.println(s.substring(0, 22));

        //some middle part of string to end
        System.out.println(s.substring(23));
        // last word
        System.out.println(s.substring(13, 22));

        System.out.println(s.substring(0, 12) + s.substring(23));

        System.out.println(s.substring(s.indexOf("beau")));

        System.out.println(s.startsWith("Estonia"));
    }
}
