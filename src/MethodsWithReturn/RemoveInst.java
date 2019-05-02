package MethodsWithReturn;

import java.util.ArrayList;

public class RemoveInst {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(1);

        int num = 1;

        System.out.println(RemoveInst(nums, num));

    }

    public static ArrayList<Integer> RemoveInst(ArrayList<Integer> nums, int num) {

        for(int i = 0; i < nums.size(); i++) {

            if(nums.get(i) == num) {
                nums.remove(nums.get(i));
                i--;
            }

        }
        return nums;
    }

}
