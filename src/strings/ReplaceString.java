package strings;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * to write a program to replace a String
 *
 * @author Kätlin Padesaar-Korela
 */

public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = scanner.nextLine();



        boolean isMatching = false;
        String source = null;
        while(!isMatching){
            System.out.println("Which string to replace");
            source = scanner.nextLine();

            if(s.contains(source)) {
                isMatching = true;
            } else {
                System.out.println("String not found! Enter again.");
            }

            //check non-case sensitive
            String[] sArr = s.split("");
            for(String word: sArr){
                if(word.equalsIgnoreCase(source)){
                    isMatching = true;
                    break;
                }
            }
            if(!isMatching) {
                System.out.println("String not found! Enter again");
            }
        }

        System.out.println("Enter the replacement string");
        String destination = scanner.nextLine();

        String result = s.replace(source, destination);
        //System.out.println(result);

       // String result = s.replaceAll( "\\d", destination); // \d : numbers
       System.out.println(result);

       // String result = s.replaceAll(source, destination);



    }
}