package Arrays;

import java.util.Arrays;

public class IncrementArrayValues {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(nums) + " ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        int[] intOdds = new int[10];
        int[] intEvens = new int[10];

        int z = 0;

        for (int n : nums) {

            if (n % 2 == 0) {
                n = n * 2;
                intEvens[z] = n;
                z++;


            } else {
                n = n * 3;
                intOdds[z] = n;
                z++;
            }

            System.out.print(n + " ");

        }

        System.out.println();

        System.out.print(Arrays.toString(intOdds) + " ");
        System.out.println();
        System.out.print(Arrays.toString(intEvens) + " ");



    }
}
