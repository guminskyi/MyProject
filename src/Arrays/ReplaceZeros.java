package Arrays;

import java.util.Arrays;

public class ReplaceZeros {
    public static void main(String[] args) {

        int[] nums = {0,5,0,3};
        int max;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                max = 0;

                for(int k = i + 1; k < nums.length; k++) {

                    if(nums[k] > max && nums[k] % 2 == 1) {
                        max = nums[k];
                    }

                    if(max != 0) {
                        nums[i] = max;
                    }

                }

            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
