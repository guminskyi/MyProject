package Arrays;

import java.util.Arrays;

public class CopyOfFirstLast {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int[] numsCopy = new int[] {nums[0], nums[nums.length - 1]};

        System.out.println(Arrays.toString(numsCopy));


    }
}
