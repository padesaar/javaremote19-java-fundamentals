package petrolStation;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Simulate the process of refueling. Within the while loop ask user if you should continue or finish. For every entered “continue” command you should add a specific amount of petrol and money (both of type double) and view it on the console.
 * At the end user should pay for petrol. Consider multiple possibilities, like:
 * The user paid exactly as much as required.
 * The user paid too much (cashier should return the rest of the money).
 *  The user paid too little – should be asked for the rest.
 */


public class PetrolStationHomework {
    public static void main(String[] args) {


    }

    private static Fuel[] getProducts() {

        Fuel fuel1 = new Fuel();
        fuel1.setName("Diesel");
        fuel1.setPrice(1.89d);

        Fuel fuel2 = new Fuel();
        fuel2.setName("95 fuel");
        fuel2.setPrice(1.93d);

        Fuel fuel3 = new Fuel();
        fuel3.setName("98 fuel");
        fuel3.setPrice(1.97d);

        return new Fuel[] {fuel1, fuel2, fuel3};


    }
    private static int displayMainMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Petrol Station \n----------------");
        System.out.println("1. Shop fuel \n2. Shopping cart \n3. Exit");
        System.out.println("Choose an option from above:");

        return displayMainMenu();
    }

    private static ShopFuel getProductToCart () {
        System.out.println("Shop Fuel");

        Fuel[] products = getProducts();
        //displaying the products
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + "." + products[i].getName());
        }

        System.out.println(products.length + ". ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option from above:");
        int productChoice = scanner.nextInt();

        System.out.println("Enter how many liters you want");
        Fuel product = new Fuel();
        double fuelQuantity = scanner.nextDouble();
        double fuel = 0;
        double fuelPrice;
            System.out.println("Filling up tank");

            while(fuel <= fuelQuantity){
            fuel++;

        }

        System.out.println("Do you want to add more fuel?");
        System.out.println("1. Yes, 2.No");
        System.out.println("Choose option above");
        int answer = scanner.nextInt();

        while (answer == 2) {
            System.out.println("Proceed to Pay");
            break;
        }
        double moreFuel = 0;
        while (answer == 1) {
            System.out.println("Enter how many liters you want to add");
            moreFuel = scanner.nextDouble();

        }
        while (fuel <= moreFuel) {
            fuel++;
            fuelPrice = fuel * fuelQuantity;
            System.out.println("Total amount of fuel:" + fuel + ".Total price: " + fuelPrice);

        }


        //price calculation
        double price = products[productChoice].getPrice() * quantity;

        //Creating product line for cart


        return shopFuel;


    }
}