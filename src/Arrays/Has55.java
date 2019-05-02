package Arrays;

import java.util.Arrays;

public class Has55 {
    public static void main(String[] args) {

        int[] nums = {1,2,5,5,9,2};

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && nums[i+1] == 5) {
                found = true;
                break;
            }
        }

        System.out.println(found);

    }
}
