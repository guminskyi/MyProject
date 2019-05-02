package MethodsWithReturn;

import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] nums = {scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt()};
        PlusMinus(nums);

    }

    public static void PlusMinus(int[] nums) {

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > 0) {
                positives++;

            } else if(nums[i] < 0) {
                negatives++;

            } else if(nums[i] == 0){
                zeros++;

            }

        }

        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Zeros: " + zeros);

    }

}
