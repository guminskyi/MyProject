package Arrays;

import java.util.Scanner;

public class KitchenItems {
    public static void main(String[] args) {

        System.out.println("Please enter an item:");

        Scanner scn = new Scanner(System.in);

        String[] kitchenItems = {"knife", "wooden spoons", "plates", "cups", "forks", "pan",
        "pot trash can", "fridge", "dishwasher"};

        for (String item : kitchenItems) {

            item = scn.nextLine();

            switch (item.toLowerCase()) {
                case "knife":
                    System.out.println("Knife is used to cut food");
                    break;
                case "wooden spoons":
                    System.out.println("Wooden spoons are used to eat soup");
                    break;
                case "plates":
                    System.out.println("Plates are used to eat from them");
                    break;
                case "cups":
                    System.out.println("Cups are used to drink from them");
                    break;
                case "forks":
                    System.out.println("Forks are used to eat with them");
                    break;
                case "pan":
                    System.out.println("Pan is used to cook food");
                    break;
                case "pot trash can":
                    System.out.println("Pot trash can is used to throw trash into it");
                    break;
                case "fridge":
                    System.out.println("Fridge is used to store food in it");
                    break;
                case "dishwasher":
                    System.out.println("Dishwasher is used to wash dishes");
                    break;
                default:
                    System.out.println("Unrecognized item");

            }

        }

    }
}
