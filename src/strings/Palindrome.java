package strings;

import java.util.Scanner;

/**
 * To check a given word is a palindrome
 * palindrome - if you reverse the word it gives you same word (nt madam = madam)
 * @author Kätlin Padesaar-Korela
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.nextLine();
        StringBuilder reverseWord = new StringBuilder();

        // MADAM we have to check every character - always use loop
        //compares the cases
        for(int i = word.length() - 1; i >= 0; i-- ) {
            //-1 sest array algab 0-ga, > sest reverse ja 1-- sest reverse
       reverseWord.append(word.charAt(i)); //appendi asemel oli enne +=

        }
    if (word.equals(reverseWord.toString())) { //equalsIgnoreCase ei võrdle suuri tähti
        System.out.println("This is a palindrome");
    } else {
        System.out.println("This is not a palindrome");
    }

    }
}
