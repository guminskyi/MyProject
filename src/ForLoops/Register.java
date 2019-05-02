package ForLoops;

import java.util.Scanner;

public class Register {
    public static void main(String[] args) {

//        int items;
//        String itemName = "";
//        int itemN = 1;
//        double totalPrice = 0;
//        String allItems = "";
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("How many items are you purchasing?");
//        items = input.nextInt();
//
//        do {
//            System.out.println("What is item " + itemN + "?");
//            itemName = input.next();
//
//            System.out.println("What is item " + itemN + " price?");
//            double price = input.nextDouble();
//
//            totalPrice += price;
//            items--;
//            allItems += itemName + ", ";
//            itemN++;
//        } while (items != 0);
//
//        allItems = allItems.substring(0, allItems.length() - 2);
//
//        System.out.println("Your items are: " + allItems);
//        System.out.println("Your total is: " + "$" + totalPrice);

        Scanner in = new Scanner(System.in);
        int numOfItems;

        double price, totalPrice;
        totalPrice = 0;

        String items, totalItems;
        totalItems = "";

        System.out.println("How many items are you purchasing?");
        numOfItems = in.nextInt();

        for (int i = 1; i <= numOfItems; i++) {

            System.out.println("What is item " + i + "?");
            items = in.next();
            totalItems += items + ", ";

            System.out.println("How much is " + items + "?");
            price = in.nextDouble();
            totalPrice += price;

            if (i == numOfItems) {
                System.out.println("Your items: " + totalItems.substring(0, totalItems.length() - 2));
                System.out.println("Your total price: $" + totalPrice);
            }
        }



    }
}
