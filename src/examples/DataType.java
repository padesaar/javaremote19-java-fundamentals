package examples;

/**
 * Examples of Primitive datatype
 *
 * @author Kätlin Padesaar-Korela
 */
public class DataType {
    //Primitive Data Types
    // Numbers //default value is 0 if you dont assign value
    int a = 1;
    int p; //called declaration
    byte byteNumber = 120;
    long longNumber = 54545681351L;
    short shortNumber = -32000;

    float decimalNumber = 2.45f; //2.45
    double doubleDecimalNumber = 3.456d;

    //Character
    char alpha =  'F'; //can hold only one alphabet

     //True/False
    //asking a question
    boolean hadLunch = true; // had lunch?
    boolean isHoliday = false; //default value is false

    /* Multi-line
    comment
     */

    int i; // 0
    float x; // 0.00f
    char animal; //  ''
    boolean isClassTomorrow; // false

    //Non-primitive data types
    String word = "I'm a developer";

    Character random =  'u';
    Integer number = 5;
    Float numberSecond = 2.45F;
    Integer randomNumber; // null

    //Multi-declatarion
    int numberOne, numberTwo, numberThree;

    String fruit = "apple", vegetable = "pumpkin";

    //Scope of class variables
    private static String CAR = "Toyota"; //can used only this class file
    public static String FOOD = "Cake";



    public static void main(String[] args) {
        int k = 0;
        Integer y = null; 
        
        System.out.println(k);
        System.out.println(y);


        String _color = "Black";
        int $hexaNumber = 0x2A;

        float exam12_mark = 100.10f;

        String className = "sda";

        int a = 100;
        int b = 0;

        int C = a + b;

        System.out.println(CAR);
        System.out.println(FOOD);


    }
    
}
