package MethodsWithReturn;

import java.util.*;

public class ArrayMethods {

    public static void main(String[] args) {

        // method getIntArray5
        // params/args 0
        // return int array

        // creates an array with 5 ints and assigns random nums 0-100
        // returns the array

        // ex. getIntArray5() -> [43,21,1,76,5]

        Random random = new Random();

        int[] nums2 = { random.nextInt(101),
                        random.nextInt(101),
                        random.nextInt(101),
                        random.nextInt(101),
                        random.nextInt(101) };

        System.out.println(Arrays.toString(nums2));

        int[] myNums = getIntArray5();
        System.out.println(Arrays.toString(myNums));

        int sumNums2 = 0;
        int sumMyNums = 0;

        for(int i = 0; i < nums2.length; i++) {
            sumNums2 += nums2[i];
        }

        for(int j = 0; j < myNums.length; j++) {
            sumMyNums += myNums[j];
        }

        if(sumNums2 > sumMyNums) {
            System.out.println("SumNums2 is larger");
        } else {
            System.out.println("SumMyNums is larger");
        }

    }

    public static int[] getIntArray5() {

        int[] nums = new int[5];
        Random random = new Random();

        for(int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(101);
        }

        return nums;
    }



}
