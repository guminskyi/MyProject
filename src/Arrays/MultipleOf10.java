package Arrays;

import java.util.Arrays;

public class MultipleOf10 {
    public static void main(String[] args) {

        int[] nums = {2,10,3,4,20,5,10,20,4,30,8};

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] % 10 == 0 && nums[i+1] % 20 == 0) {
                continue;
            }

            if (nums[i] % 10 == 0 || nums[i] % 20 == 0 && nums[i+1] % 30 != 0) {

            }

            if (nums[i] % 10 == 0 && nums[i+1] % 20 != 0) {

                if (nums[i] % 20 == 0) {
                    nums[i+1] = nums[i];
                }

                nums[i+1] = nums[i];

            }




        }

        System.out.println(Arrays.toString(nums));

    }
}
