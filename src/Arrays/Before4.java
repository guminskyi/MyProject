package Arrays;

import java.util.Arrays;

public class Before4 {
    public static void main(String[] args) {

        int[] nums = {1,2,4,1};

        for (int n : nums) {

            if (n == 4) {
                break;
            }

            System.out.print(n + " ");


        }


    }
}
