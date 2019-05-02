package Methods;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {

        sum(10,20);

        sumAll(10,20,30,40,50);

        shoppingList("apples", "kiwi", "bananas");
        System.out.println();
        shoppingList("headphones", "computer", "mouse");

    }

    public static void sum(int n1, int n2) {

        System.out.println(n1 + n2);

    }

    public static void sumAll(int... nums) {

        System.out.println("Number of inputs: " + nums.length);
        int sum = 0;

        for(int num : nums) {

            sum += num;

        }

        System.out.println("Sum: " + sum);

    }

    // method shoppingList
    // args: String var args
    // return: void
    // It will print shopping items in single line, sep by space
    // ex. shoppingList("apples", "kiwi", "bananas") -> "Shopping list: apples kiwi bananas"

    public static void shoppingList(String... items) {

        // System.out.print("Shopping list: " + Arrays.toString(items));

        System.out.print("Shopping list: ");

        for(String item : items) {
            System.out.print(item + " ");
        }

    }

}
