package shopping;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create class Product, it should contain at least two fields – name and price.
 * Create an empty array of Products – it’s size should be at least 5.
 * Populate the array with some products - this array represents the menu for the user.
 *
 * Simulate the process of doing shopping:
 * ask for a product,
 * add it to the cart (array),
 * change index,
 * if index will be greater than 5 – finish shopping,
 * pay for the products.
 *
 */

public class Shopping {
    public static void main(String[] args) {
    mainMenu(new Cart());

    }
    private static Product[] getRandomProducts(){
        Product fruit1 = new Product();
        fruit1.setName("Apple");
        fruit1.setPrice(14.00f);

        Product vegetable = new Product();
        vegetable.setName("Tomato");
        vegetable.setPrice(2.00f);

        Product food = new Product();
        food.setName("Pizza");
        food.setPrice(5.00f);

        Product chocolate = new Product();
        chocolate.setName("Kitkat");
        chocolate.setPrice(1.00f);

        Product chips = new Product();
        chips.setName("Lays");
        chips.setPrice(2.50f);

        return new Product[]{fruit1, vegetable, food, chocolate, chips};
    }

    private static Cart mainMenu(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        int mainMenuOption = displayMainMenu();


        switch(mainMenuOption){
            case 1:
                boolean hasMoreShopping = false;
                int counter = 0;
                int cartLimit = 5;
                float totalPrice = 0;
                ProductLine[] products = new ProductLine[cartLimit]; //can hold only 5 products


                do {

                    if(counter >= cartLimit){
                        System.out.println("Your limit is reached. Please proceed to checkout" );
                        break;
                    }
                    ProductLine productLine = getProductToCart();

                    if(productLine == null){
                        mainMenu(cart);
                    } else {
                    products[counter] = productLine; //we assign products array to productLine
                    cart.setProducts(products);
                    totalPrice += productLine.getPrice();
                    cart.setTotalPrice(totalPrice);

                    System.out.println("Do you want to shop more products?");
                    String errorMessage = "Incorrect answer. Please enter again.";
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

                    if (hasMoreShopping && counter < 5) {
                        counter++;
                    }
                    }
                } while (hasMoreShopping);

                mainMenu(cart);
                break;

            case 2:
// shopping cart
                // display the cart menu
                //get option from the user
                //based on options you will do the operation
                // show cart
                // 1. display all the products(productLine) added to the cart
                // display the total sum
                //do you want to go back to the cart menu (true or false)
                // true - go cart menu
                //if false - ask if you want to pay (true false)
                //if true payment successful, go back to cart menu
                // if false go back to cart menu
                // if the payment is successful, then cart should not have any products inside, total price 0

                cart = cartMenu(cart);
                break;

            case 3:
                System.out.println("Thanks for shopping!");
                break;

                //outside do for loop
        }

        return cart;

    }


    private static int displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("MAIN MENU \n--------------");
        System.out.println("1. Shop products \n 2. Shopping cart \n 3. Exit ");
        System.out.println("Choose an option from above:");

        return getMenuOption(3);
    }
    private static ProductLine getProductToCart(){
        System.out.println("MAIN MENU \n--------------");

        //to get the random products to display
        Product[] products = getRandomProducts();
        //displaying the products
        for(int i = 0; i < products.length; i++) {
            System.out.println(i + "." + products[i].getName());

        }

        System.out.println(products.length + ". " + "Exit to main menu");
        // to get a option for product
        System.out.println("Choose an option from above:");
        int productChoice = getMenuOption(products.length);

        if(productChoice == products.length){ //5 exit to main menu ja 5 on length
            return null; //0 for apple etc, 5. exit to main menu// we cant go right back to main menu... no product is selected
        } else {
            System.out.println("Enter quantity:");
            Scanner scanner = new Scanner(System.in);
            float quantity = 0;
            String errorMessage = "Incorrect quantity. Please enter again:";

          do{
              if(!scanner.hasNextFloat()) {
                  System.out.println(errorMessage);
              } else{
                  quantity = scanner.nextFloat();
                  if(quantity <= 0){
                      System.out.println(errorMessage);

                  }
                  }
          } while(quantity <= 0);



            //price calculation
            float price = products[productChoice].getPrice() * quantity;

            //Creating product line for cart
            ProductLine productLine = new ProductLine();
            productLine.setProduct(products[productChoice]);
            productLine.setQuantity(quantity);
            productLine.setPrice(price);

            return productLine;
        }

    }
    private static Cart cartMenu(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        int cartMenuOption = displayCartMenu();

        switch(cartMenuOption) {
            case 1:
                int counter = 1;

                if(cart != null) {
                for(ProductLine product : cart.getProducts()){
                    if(product != null) {
                        System.out.println(counter + ". " + product.getProduct().getName() + ". " + product.getQuantity() + ". " + product.getPrice());
                    }
                    counter++;
                }


                System.out.println("Total price: " + cart.getTotalPrice());
                System.out.println("Do you want to go back to cart menu?");
                String errorMessage = "Incorrect answer. Please enter again.";
                boolean checker = false;
                boolean answer = false;

                do {
                    if(!scanner.hasNextBoolean()) {
                        System.out.println(errorMessage);
                        scanner.next();
                    } else {
                        answer = scanner.nextBoolean();
                        checker = true;
                    }

                } while (!checker);

        if (answer) {
            cartMenu(cart);
        } else{
            boolean isPayd = isPaymentDone();

            if (isPayd){
                cart = new Cart();
                mainMenu(cart);
            } else {
                cartMenu(cart);
            }

        }

                } else {
                    System.out.println("Cart is empty!");
                    System.out.println("Going back to main menu...");
                    cartMenu(null);
                }
              break;

                case 2:
                if(cart.getTotalPrice() <= 0){
                    System.out.println("Nothing to pay. Going back to main menu");
               mainMenu(cart);
                } else {
                    boolean isPaid = isPaymentDone();

                    if (isPaid){
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

    private static boolean isPaymentDone() {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect answer. Please enter again.";


        boolean checker = false;
        boolean answer = false;

        System.out.println("Do you want to pay?");

        do {
            if(!scanner.hasNextBoolean()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                answer = scanner.nextBoolean();
                checker = true;
            }

        } while (!checker);

        if (answer) {
            System.out.println("Payment succesful! Going back to main menu....");
        return true;
        } else {
            System.out.println("Payment unsuccesful! Going back to main menu....");
       return false;
        }
    }
    private static int displayCartMenu(){
        System.out.println("CART MENU \n-----------");
        System.out.println("1. Show cart \n 2. Pay \n 3. Exit to main menu");
        System.out.println("Choose an option from above:");

        return getMenuOption(3);

    }
    private static int getMenuOption(int limit){ //tegime selle, et main menus ei annaks errorit kui nt number 4 valib
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option. Please enter again:";

        int option = limit + 1; //so it will always give the wrong option, it comes out of loop when gets right option

        do {

            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt();

                if(option > limit){
                    System.out.println(errorMessage);
                }
            }

        } while(option > limit);
        return option;
    }

}

/**
 * Main menu:
 * 1. shop products
 * 2. shopping cart
 * 3. exit
 * choose any option form above
 * 1
 *
 * Products menu:
 * 0.
 * 1. apple
 * 3. exit to main menu
 * choose any product to add to cart
 * 1
 * quantity:
 * 1
 *
 * cart menu:
 * show cart
 * pay to cart
 * exit to menu
 * choose any option above
 *
 * would you like to pay (true/false)
 */