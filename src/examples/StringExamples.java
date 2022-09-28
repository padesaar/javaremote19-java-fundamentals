package examples;

/**
 * String Examples
 * @author Kätlin Padesaar-Korela
 */

public class StringExamples {
    public static void main(String[] args) {

        String firstName = "Kätlin";
        String lastName = "Padesaar-Korela";
        String fullName = firstName + lastName; //option 1

        System.out.println(fullName);

        fullName = firstName.concat(lastName); //option 2

        String city = "Tallinn " ;

        String ageString = "My age is : " + 3 +  ". I live in " + city + ". My name is: " + fullName;

        System.out.println(ageString);

        String ageStringFormatted = String.format("My age is : %d. I live in %s. My name is: %s", 3, city, fullName); //d is for integer, s is for string
        System.out.println(ageStringFormatted);

//vaheteema ei puutu stringi teemasse
   //2874 2x8pow 3 8x8pow2 7x8pow1 4x8pow0 1024+512+56+4=1596
 // 8pow 3 tähendab 8x8x8 ehk siis 512  8pow0 on alati 1

        //Stringbulder

        StringBuilder str1 = new StringBuilder("Hello");
        StringBuilder str2 = str1.append("World"); //automaatselt lisab srt1 -le juurde
        System.out.println(str2);

        //need to assign to the variable additionally
        String var1 = "Red";
        var1 = var1.concat("Yellow").concat("Green"); //doesnt add automatically
        String var2 = "Blue";
        System.out.println(var1);
        System.out.println(var2);


        //Equality
        //== compares object memory reference and the value
        //string.equals() compares only the value

        String s1 = "Sibul"; //goes to string pool
        String s2 = "Sibul"; // string pool
        String s3 = new String("Sibul"); //goes to heap memory/ reference ex. 546567686576
        String s4 = new String("Sibul"); //heap memory / ex. 748294702984

        System.out.println(s1 == s3); //comparing the value, answer true or false
        //answer is false, because of memory difference, == compares memory and value

        System.out.println(s1.equals(s3)); //compares only values
        System.out.println(s3 == s4); //false because in heap memory every thing has different memory reference


    }
}
