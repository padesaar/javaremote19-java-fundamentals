package petrolStation;

import java.util.Scanner;

/**
 * Simulate the process of refueling. Within the while loop ask user if you should continue or finish. For every entered “continue” command you should add a specific amount of petrol and money (both of type double) and view it on the console.
 * At the end user should pay for petrol. Consider multiple possibilities, like:
 * The user paid exactly as much as required.
 * The user paid too much (cashier should return the rest of the money).
 * The user paid too little – should be asked for the rest.
 */


public class PetrolStationHomework {
    public static void main(String[] args) {
        System.out.println("WElCOME TO PETROL STATION!");
        System.out.println("Feeling empty? Shop fuel!");

        Cart cart = new Cart();
        cart.getProducts();
        cart.setProducts();
        double totalPrice;
        cart.setTotalPrice(cart.getTotalPrice());

        Fuel[] fuel = getFuel();
        //displaying the products
        for (int i = 0; i < fuel.length; i++) {
            System.out.println(i + "." + fuel[i].getName());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option from above:");
        int fuelChoice = scanner.nextInt();

        System.out.println("Enter how many liters you want");
        double quantity = scanner.nextDouble();

        System.out.println("Filling up tank");
        ShopFuel shopFuel = new ShopFuel();
        shopFuel.setFuel(fuel[fuelChoice]);
        shopFuel.setQuantity(quantity);
        shopFuel.getPrice(fuel);
        double price = fuel[fuelChoice].getPrice() * shopFuel.getQuantity();
        shopFuel.setPrice(price);
        cart.setTotalPrice(price);

        while (quantity > 0) {
            break;
        }
        System.out.println("Do you want to add more fuel?");
        System.out.println("1. Yes, 2.No");
        System.out.println("Choose option above");
        int answer = scanner.nextInt();

        while (answer == 2) {
            totalPrice = (fuel[fuelChoice].getPrice()) * quantity;
            System.out.println("Total amount on fuel:" + quantity + ".Total price:" + totalPrice);
            System.out.println("Proceed to Pay");
            break;
        }

        while (answer == 1) {

            double moreFuel;
            System.out.println("Enter how many liters you want to add");
            moreFuel = scanner.nextDouble();

            quantity = moreFuel + quantity;
            totalPrice = fuel[fuelChoice].getPrice() * quantity;

            System.out.println("Total amount on fuel:" + quantity + ".Total price:" + totalPrice);
            System.out.println("Let's proceed to checkout!");
            break;

        }

        System.out.println("Enter amount of money");
        double money = scanner.nextDouble();


        while (money == cart.getTotalPrice()) {
            System.out.println("Payment correct. Thank you for getting fuel with us!");
            break;


        }
        while (money > cart.getTotalPrice()) {
            totalPrice = fuel[fuelChoice].getPrice() * quantity;
            double resultOver = money - totalPrice;
            System.out.println("Money that was overpaid:" + resultOver);
            System.out.println("Proceed to cashier to return extra paid money!");
            System.out.println("Thank you for getting fuel with us!");
            break;


        }
        while (money < cart.getTotalPrice()) {
            double resultUnder = money - cart.getTotalPrice();
            System.out.println("Unsufficient funds, add more money! You need to pay" + resultUnder + " more");
            double addedMoney = scanner.nextDouble();
            money += addedMoney;
            if ((addedMoney + money) > cart.getTotalPrice()) {
                System.out.println("Thank you! Overpaid amount of money is:" + ((money + addedMoney) - cart.getTotalPrice()) + ". Please proceed to cashier.");
            } else {
                System.out.println("Thank you for your payment!");
            }

            System.out.println("Thank you for getting fuel with us!");

            break;

        }
    }


    private static Fuel[] getFuel() {

        Fuel fuel1 = new Fuel();
        fuel1.setName("Diesel");
        fuel1.setPrice(1.89d);

        Fuel fuel2 = new Fuel();
        fuel2.setName("95 fuel");
        fuel2.setPrice(1.93d);

        Fuel fuel3 = new Fuel();
        fuel3.setName("98 fuel");
        fuel3.setPrice(1.97d);

        return new Fuel[]{fuel1, fuel2, fuel3};

    }

}
