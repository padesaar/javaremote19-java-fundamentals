package petrolStation;

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

        return getMenuOption(3);
    }

    private static int getMenuOption(int i) {

    }


    private static int displayCartMenu() {
        System.out.println("CART MENU \n--------------");
        System.out.println("1. Show cart \n2. Pay \n3. Exit to main menu");
        System.out.println("Choose an option from above:");

        return getMenuOption(3);
    }
    private static void mainMenu(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        int mainMenuOption = displayMainMenu();

        switch (mainMenuOption) {
            case 1: // shop fuel

                double totalPrice = 0;
                Fuel[] products = new Fuel[];

                    Fuel product = getProductToCart();

                    if (product == null) {
                        mainMenu(cart);
                    } else {

                        cart.setProducts(products);
                        totalPrice += product.getPrice();
                        cart.setTotalPrice(totalPrice);

                        System.out.println("Do you want to shop more products?");
                        String errorMessage = "Incorrect answer. Please enter again:";
                        boolean checker = false;

                        do {
                            if (!scanner.hasNextBoolean()) {
                                System.out.println(errorMessage);
                                scanner.next();
                            } else {
                                hasMoreShopping = scanner.nextBoolean();
                                checker = true;
                            }
                        } while (!checker);

                        if (hasMoreShopping) {
                            counter++;
                        }
                    }
                } while (hasMoreShopping);

                mainMenu(cart);
                break;
            case 2:
                cart = cartMenu(cart);
                break;
            case 3:
                System.out.println("Thanks for shopping!");
                break;
        }

    private static Fuel getProductToCart() {
        System.out.println("FUEL MENU \n----------------");

        // To get the random products to display
        Fuel[] products = getProducts();

        // Displaying the products
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + ". " + products[i].getName());
        }

        System.out.println(products.length + ". " + "Exit to main menu");

        // To get option for product
        System.out.println("Choose an option from above:");
        int productChoice = getMenuOption(products.length);

        Scanner scanner;
        if (productChoice == products.length) {
            return null; // No product is selected
        } else {
            System.out.println("Enter quantity:");
            scanner = new Scanner(System.in);
            double quantity = 0;
            String errorMessage = "Incorrect quantity! Please enter again:";

            do {
                if (!scanner.hasNextFloat()) {
                    System.out.println(errorMessage);
                    scanner.next();
                } else {
                    quantity = scanner.nextFloat();

                    if (quantity <= 0) {
                        System.out.println(errorMessage);
                    }
                }
            } while (quantity <= 0);


            // Price calculation
            double price = products[productChoice].getPrice() * quantity;


            FuelQuantity fuelQuantity = new FuelQuantity();
            fuelQuantity.setFuel(products[productChoice]);
            fuelQuantity.setQuantity(quantity);
            fuelQuantity.setPrice(price);

            return fuelQuantity;
        }

        private static Cart cartMenu (Cart cart) {
                Scanner scanner = new Scanner(System.in);
        int cartMenuOption = displayCartMenu();

        switch (cartMenuOption) {
            case 1:
                int counter = 1;

                if (cart != null) {
                    for (fuelQuantity fuel : cart.getProducts()) {
                        if (product != null) {
                            System.out.println(counter + ". " + fuel.getProduct().getName() + ", " + product.getQuantity() + ", " + product.getPrice());
                        }

                        counter++;
                    }

                    System.out.println("Total price:" + cart.getTotalPrice());
                    System.out.println("Do you want to go back to the cart menu?");
                    String errorMessage = "Incorrect answer. Please enter again:";
                    boolean checker = false;
                    boolean answer = false;

                    do {
                        if (!scanner.hasNextBoolean()) {
                            System.out.println(errorMessage);
                            scanner.next();
                        } else {
                            answer = scanner.nextBoolean();
                            checker = true;
                        }
                    } while (!checker);

                    if (answer) {
                        cartMenu(cart);
                    } else {
                        boolean isPaid = isPaymentDone();

                        if (isPaid) {
                            cart = new Cart();
                            mainMenu(cart);
                        } else {
                            cartMenu(cart);
                        }
                    }
                } else {
                    System.out.println("Cart is empty!");
                    System.out.println("Going back to cart menu...");
                    cartMenu(null);
                }

                break;
            case 2:
                if (cart.getTotalPrice() <= 0) {
                    System.out.println("Nothing to pay! Going back to Main menu..");
                    mainMenu(cart);
                } else {
                    boolean isPaid = isPaymentDone();

                    if (isPaid) {
                        cart = new Cart();
                        mainMenu(cart);
                    } else {
                        cartMenu(cart);
                    }
                }

                break;
            case 3:
                mainMenu(cart);
                break;
        }

        return cart;
        }

        private static int displayCartMenu() {
            System.out.println("CART MENU \n--------------");
            System.out.println("1. Show cart \n2. Pay \n3. Exit to main menu");
            System.out.println("Choose an option from above:");

            return getMenuOption(3);
        }
    }
