package Methods;

public class Cooking {
    public static void main(String[] args) {

        cook("Steak");
        youWillNeed("Meat, Oil, Salt, Pepper, Spoon, Tomato, Onions");
        cookFor(45, "Grilling" );
        ready();

    }

        // method cook accepts a String food name, and prints
        // "Today we are cooking " + food name

        public static void cook(String foodName) {

            System.out.println("Today we are cooking " + foodName + ".");
            System.out.println();

        }

        // method youWillNeed, accepts a String with things we need
        // prints "We need following items: " + items

        public static void youWillNeed(String items) {

            System.out.println("We need foolowing items: " + items + ".");
            System.out.println();

        }

        // method cookFor accepts minutes and way of cooking, and prints:
        // "You need to cook for 'amount of minutes' by wayOfCooking

        public static void cookFor(int minutes, String wayOfCooking) {

            System.out.println("You need to cook for " + minutes + " minutes by " + wayOfCooking + ".");
            System.out.println();

        }

        // method ready, doesn't accept any params,
        // prints "Meal is ready! Enjoy"

        public static void ready() {

            System.out.println("Meal is ready! Enjoy");

        }

    }

