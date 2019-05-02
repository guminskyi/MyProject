package Arrays;

import java.util.ArrayList;

public class AppendPosSum {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(-6);
        nums.add(3);
        nums.add(-8);
        nums.add(0);
        nums.add(4);
        nums.add(3);

        System.out.println(AppendPosSum(nums));

    }

    public static ArrayList<Integer> AppendPosSum(ArrayList<Integer> nums) {

        ArrayList<Integer> newNums = new ArrayList<>();
        int sum = 0;

        for(int num : nums) {
            if(num > 0) {
                newNums.add(num);
                sum += num;
            }
        }

        newNums.add(sum);

        return newNums;

    }

}
