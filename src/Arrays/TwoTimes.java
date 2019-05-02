package Arrays;

import java.util.ArrayList;

public class TwoTimes {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> newNums = new ArrayList<>();

        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);

        newNums.addAll(nums);

        System.out.println(TwoTimes(newNums));

    }

    public static ArrayList<Integer> TwoTimes(ArrayList<Integer> nums) {

        ArrayList<Integer> newNums = new ArrayList<>();


        for(int i = 0; i < nums.size(); i++) {
            newNums.add(nums.get(i));
            newNums.add(nums.get(i));
        }

        return newNums;

    }

}
