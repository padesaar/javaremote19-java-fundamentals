/**
 * Statement examples
 * @author Kätlin Padesaar-Korela
 *
 */

public class Statement {
    public static void main(String[] args) {
        int i = 8;
        int y = 10;
        String name = "Kätlin"; // executes only when condition is true

        if (name == "Kätlin" && name !="Mari")  {
            System.out.println("The name is correct");
        }

        if ((i > y && y > 0) || i == 100) {
            System.out.println("i is is greater than y"); // if the condition is true it prints that
        }

        System.out.println("This is simple program");

        /*
        if(shirt size == M && shirt color == black)
        // buy the shirt
         */

        /*
        if(shirt size M && shirt colour == black {
        //buy the shirt
       } else {
       // buy the shirt from other shop
        }
        */

        if(i > y) {
            System.out.println("i is greater than y");
        } else {
            System.out.println("y is greater than i");

        }


          /*
        if(shirt size M && shirt colour == black {
        //buy the shirt
       } else if (shirt size == M && shirt color == blue) {
       // buy the shirt

        } else {
        // buy the shirt from other shop
           */


        if(i > y) { //if you need to check multiple conditions
            System.out.println("i is greater than y");

    } else if(i < 9) {
        System.out.println("i is lesser");

        } else {
        System.out.println("i is invalid");
    }

        // Switch statements
        // if you want to check one condition for multiple values

        int x = 10;
        int j = 6;
        int z = x + j; // 11 (proovi nii, et arvude summa oleks 11)

        switch (z) { // to check multiple values
            case 10:
            System.out.println("The value of z is 10");
            case 11:
            System.out.println("The value of z is 11");
            break; // kui break panna, siis java läheb kohe üle edasi bloki lõpuni ja järgmisi blokke ei loe
            case 12:
            System.out.println("The value of z is 12");
            default: // kui breaki pole vahel, siis excecutib kõik statemendid
                System.out.println("Default block executed"); // kui ükski pole tõene statement, siis executib defaulti

        }

        String color = "Red";
        switch (color) {
            case "Red":
                System.out.println("I'm red");
                break;
            case "White":
                System.out.println("I'm white");
                break;
        }

        // Loops, the are 3 loops in Java: while, do-while and for loop
        // While /expects only boolean conditions (entry check loop)
        int money = 0;
        while(money <= 5) {
            System.out.println("Doing job. Money = " + money); // prints money = 5 here
            money++; // it means:  money = money +1

        }

        // Do-While (excit-check loop) // executes first and then checks (100)
        //end of the last block money value is 6

        do {
            System.out.println("money =" + money);
            money += 10; //money = money + 10
        } while(money < 100);

        // For loop (used when you want single line condition)
        //int g = 0; // kui see on, siis pole vaja for (int panna), siis jääb for (;... jne muud tingimused)

        for (int g = 0; g <= 6; g++ ) { // int g is initialized only fisrt time

            System.out.println("g value is:" + g);
        }



    }

}
