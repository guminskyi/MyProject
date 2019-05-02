package Arrays;

import java.util.Scanner;
import java.util.Random;

public class LargeArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many items in array?");
        int count = scn.nextInt();

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = random.nextInt(1000);
        }

        for (int n : nums) {
            System.out.print(n + ", ");
        }


    }
}
