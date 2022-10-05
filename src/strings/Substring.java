package strings;

import java.util.Scanner;

/**
 * To write a program to check if string has antoher string
 * get input from user
 * @author Kätlin Padesaar-Korela
 */

public class Substring {
    public static void main(String[] args) {

        // I love to write Java coding
        // find word Java

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter a search word:");
        String searchWord = scanner.nextLine();
        //contains is a mater that helps search a word by comparing
        if(sentence.contains(searchWord)) {
            System.out.println("Word matches");
        } else {
            System.out.println("Word mismatch!");
        }

    }
}
