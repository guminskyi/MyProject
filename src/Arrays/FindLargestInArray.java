package Arrays;

import java.util.Scanner;

public class FindLargestInArray {
    public static void main(String[] args) {

        // ask user to enter how many items in array

        Scanner scn = new Scanner(System.in);

        System.out.println("How many items is there in an array?");

        int count = scn.nextInt();

        // create array called nums with that capacity

        int[] nums = new int[count];

        // using a loop, enter values one by one

        for(int i = 0; i < count; i++) {
            System.out.println("Enter the number:");
            nums[i] = scn.nextInt();
        }

        // print all items in the same line using for each loop

        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        // iterate in an array, and find the largest value

        int max = nums[0];

        for(int k = 0; k < nums.length - 1; k++) {

        int a = nums[k];
        int b = nums[k+1];

            if (a < b) {
                max = b;
            }

        }

        System.out.println("Largest number: " + max);

    }
}
