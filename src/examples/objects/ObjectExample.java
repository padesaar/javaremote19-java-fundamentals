package examples.objects;

/**
 * Object Examples
 *
 * @author Kätlin Padesaar-Korela
 */

public class ObjectExample {
    public String name; //public kui tahad pääseda teistest klassides ligi
    public int a;

    //Non-organized paramiters of Normal constructor
    public ObjectExample(){ //constructor name should be tha same as class name
        System.out.println("Constructing Object Example");
        name = "Kätlin Padesaar-Korela";
        a = 6;

    }

   // Parametrisized Constructor
    public ObjectExample(int age, String name) {
        System.out.println(age);
        System.out.println(name);


    }

}
