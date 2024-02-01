// GoferOrderM3_FIB.java
// C. Newman
// 01/31/24
// Welcomes user, obtains order, calculates cost (modularized)

import java.util.Scanner;

public class GoferOrderM3_FIB {
    public static void main(String[] args) {

        // constants
        final String TODAYS_SPECIAL = "16oz package of chips";
        final double ITEM_COST = 3.25;
        final double DELIVERY_FEE = 3.0;

        // variables
        String name = "";
        int orderQty = 0;

        Scanner input = new Scanner(System.in);

        // welcome user
        // FIB 1. Fill in the blank to call the showWelcome module
        //        Remember to include the empty argument list ()
        //        Include a terminating semi-colon
        showWelcome();

        // get user name
        System.out.print("Please enter your name: ");
        name = input.nextLine();

        // show special and cost
        showItemInfo(TODAYS_SPECIAL, ITEM_COST);

        // prompt for user's order
        System.out.println("Please enter the number of items for your order: ");
        orderQty = input.nextInt();

        // confirm quantity specified
        confirmQuantity(orderQty);

        // show delivery fee notification
        notifyDeliveryFee(DELIVERY_FEE);

        // calculate and show total cost
        // FIB 2. Call the calcAndShowTotalCost module.
        //        Pass orderQty, ITEM_COST, and DELIVERY_FEE.
        //        Do not include the Call keyword
        //        Include a terminating semi-colon
        calcAndShowTotalCost(orderQty, ITEM_COST, DELIVERY_FEE);

        // show personalized thank you message
        showThankYou(name);
    }

    // display welcome message and tagline
    // FIB 3. Fill in the blank to declare the showWelcome module.
    //        Be sure to include the empty parameter list and opening brace {
    public static void showWelcome() {
        System.out.println("Welcome to Gofer Groceries!");
        System.out.println("We sell and deliver all of your grocery needs.");
    }

    // show special item and cost
    public static void showItemInfo(final String ITEM, final double COST) {
        System.out.println("Our special today is: ");
        System.out.println(ITEM + " for $" + COST);
    }

    // confirm quantity requested
    public static void confirmQuantity(int numItems) {
        System.out.println("You have selected " + numItems + " items for delivery.");
    }

    // delivery fee notification
    public static void notifyDeliveryFee(final double FEE) {
        System.out.println("A delivery fee of $" + FEE + " will be added to your order.");
    }

    // calculate and show total cost
    // FIB 4. Fill in the blank to complete the parameter list for this module
    //        The parameters are final double COST and final double FEE
    //        Continue the parameter list on the next line if necessary,
    //        don't let your line continue past (about) column 80
    public static void calcAndShowTotalCost(int qty, double itemCost, double deliveryFee) {
        double totalCost = 0.0;
        totalCost = (itemCost * qty) + deliveryFee;
        System.out.println("Your total cost is $" + totalCost);
    }

    // display personalized thank you with name
    // FIB 5. Fill in the blank to declare the showThankYou module
    //        Preface the module name with public static void
    //        Include a parameter list which accepts the String name parameter
    //        Use an opening brace {
    public static void showThankYou(String name) {
        System.out.println("Thank you for your order, " + name);
    }

}