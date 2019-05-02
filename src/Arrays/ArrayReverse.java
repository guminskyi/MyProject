package Arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] nums = {4,3,2,44,1,100,55};

        for (int i = 0; i < nums.length / 2; i++) {

            int temp = nums[i];
            nums[i] = nums[nums.length - (i+1)];
            nums[nums.length - (i+1)] = temp;

        }

       for (int num : nums) {
           System.out.print(num + " ");
       }

    }
}
