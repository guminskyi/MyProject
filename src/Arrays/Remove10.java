package Arrays;

import java.util.Arrays;

public class Remove10 {
    public static void main(String[] args) {

        int[] nums = {1,10,10,2};
        int[] nums2 = new int[nums.length];

        int num = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != 10) {
                nums2[num] = nums[i];
                num++;
            }

        }

            System.out.println(Arrays.toString(nums2));

    }
}
