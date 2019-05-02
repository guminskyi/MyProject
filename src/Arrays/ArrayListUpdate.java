package Arrays;

import java.util.List;
import java.util.ArrayList;

public class ArrayListUpdate {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        System.out.println(nums);

        // update 100 to 1000

        nums.set(0,1000);
        System.out.println(nums);

        // double the value of idx 1

        nums.set(1, nums.get(1) * 200);
        System.out.println(nums);

        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == 300) {
                nums.remove(nums.get(i));
            }
        }

        System.out.println(nums);

    }

}
