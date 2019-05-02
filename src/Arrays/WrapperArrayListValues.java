package Arrays;

import java.util.ArrayList;

public class WrapperArrayListValues {

    public static void main(String[] args) {

        Integer n = 100;
        int n2 = 100;

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(300);
        nums.add(500);
        nums.add(1234);
        nums.add(654);

        System.out.println(nums.toString());

        // for each loop

        for(Integer num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

        for(int number : nums) {
            System.out.print(number + " ");
        }

        System.out.println();

        for(int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }


    }

}
