package Arrays;

import java.util.*;

public class Consec5s {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] nums = {scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt()};
        boolean found5s = false;

        for(int i = 0; i < nums.length; i++) {

            if (nums[0] == 5 && nums[1] == 5) {
                found5s = true;
                break;
            } else if (nums[nums.length - 1] == 5 && nums[nums.length - 2] == 5) {
                found5s = true;
                break;
            } else if (nums[i] == 5 && nums[i+1] == 5){
                found5s = true;
                break;
            } else if (nums[i] == 5 && nums[i-1] == 5) {
                    found5s = true;
                    break;
            }

        }

        System.out.println(found5s);

    }
}
