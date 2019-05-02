package Arrays;

import java.util.Arrays;

public class ZeroFront {
    public static void main(String[] args) {

        int[] nums = {1,0,8,2,3,0};

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                nums[i] = nums[count];

                nums[count] = 0;

                count++;

            }

        }

        System.out.println(Arrays.toString(nums));

    }
}
