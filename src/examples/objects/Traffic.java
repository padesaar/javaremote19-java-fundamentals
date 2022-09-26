package examples.objects;

/**
 * Default constructor examples
 *
 * @author Kätlin Padesaar-Korela
 */

public class Traffic {
    public static void main(String[] args) {
        Car car = new Car(); //constructed by default bu java
        car.name = "Audi Q7"; //object is car, name we can give and value can be different
        Car car2 = new Car();
        car2.name = "BMW X2";

        Car car3 = new Car();
        car3.name = "Ford Mustang";

        car.name = "Toyota RAV4"; //now the audi q7 goes to garbage
        Car car4 = new Car(); // also Car car4 = car2 sest car2 on olemas new juba
        car4 = car2;



        System.out.println(car.name);
        System.out.println(car2.name);
        System.out.println(car3.name);
        System.out.println(car4.name);

        System.gc();

    }
}
