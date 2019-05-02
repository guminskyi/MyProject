package Arrays;

import java.util.Arrays;

public class TwoSevens {
    public static void main(String[] args) {

        int[] nums = {1,7,1,7,7};

        boolean found = false;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 7 && nums[i+1] == 7 || nums[i] == 7 && nums[i+2] == 7) {
                found = true;
                break;
            }

        }

        System.out.println(found);

    }
}
