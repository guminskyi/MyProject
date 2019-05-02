package Methods;

import java.util.Arrays;

public class AddToR {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        AddToR(nums, 6);

    }

    public static void AddToR(int[] nums, int n) {

        int len = nums.length + 1;

        int[] r = new int[len];

        for(int i = 0; i < nums.length; i++) {

            r[i] = nums[i];

            r[r.length - 1] = n;

        }

        System.out.println(Arrays.toString(r));

    }


}
