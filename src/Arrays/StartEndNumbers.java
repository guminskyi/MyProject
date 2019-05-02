package Arrays;

import java.util.Arrays;

public class StartEndNumbers {
    public static void main(String[] args) {

        int[] nums = {5,10};
        int[] newNums = new int[nums[1] - nums[0]];

        int start = nums[0];

        for(int i = 0; i < newNums.length; i++) {
            newNums[i] = start;
            start++;
        }

        System.out.println(Arrays.toString(newNums));

    }
}
