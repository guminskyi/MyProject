package Arrays;

import java.util.ArrayList;

public class TimesTwo {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        TimesTwo(nums);

        System.out.println(nums);

    }

    public static void TimesTwo(ArrayList<Integer> nums) {

        for(int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);
        }

    }

}
