package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

//        1 int[] array  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        2 int[] a = new int[]{4, 5, 6};
//        int[] b = new int[a.length + 1];
//        System.out.println(b.length);

//        3 String[] s_r = new String[]{"foo ", "hello", "bar", "world"};
//        System.out.println(s_r[0] + s_r[2]);

//        4 double[] d_r = new double[]{0.2, 0.3, 1.0, 1.5, 2.0};
//        System.out.println(d_r[2] + d_r[3]);

//        5 int[] nums = new int[]{5, 4, 3, 7, 8, 11};
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

//        6 int[] nums = new int[]{6, 7, 11, 12, 2, 3};
//
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        System.out.println(sum);

//        7 int[] nums = new int[]{60, 73, 9, 15, 200, 350};
//
//        int gnum = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//            if (gnum < nums[i]) {
//                gnum = nums[i];
//            }
//
//        }
//        System.out.println(gnum);

//        8 String[] list = new String[]{"banana", "apple", "pineapple", "banana", "mango", "banana"};
//
//        int bananas = 0;
//        for (int i = 0; i < list.length; i++) {
//
//            if (list[i].equals("banana")) {
//                bananas += 1;
//            }
//
//        }
//
//        System.out.println(bananas);

//        String[] old_r = new String[]{"one", "two", "three"};
//        String new_word = "four";
//        String[] new_r = new String[old_r.length + 1];
//
//            for (int i = 0; i < old_r.length; i++) {
//                new_r[i] = old_r[i];
//                System.out.print(new_r[i] + " ");
//            }
//
//            System.out.println();
//
//            new_r[new_r.length - 1] = new_word;
//
//            System.out.println(Arrays.toString(new_r));

            int[] growth = new int[]{-1,0,1,2,1,0,2,0,2,1};

            for(int n = 0; n < growth.length - 1; n++) {

                if (n < 3) {
                    growth[n+1] = growth[n] + 1;
                    System.out.println("Year " + (n+1) + " growth 1 cm");
                    System.out.println("Tree size: " + growth[n+1] + " cm");
                }
                else {
                    growth[n+1] = growth[n] + 2;
                    System.out.println("Year " + (n+1) + " growth 2 cm");
                    System.out.println("Tree size: " + growth[n+1] + " cm");
                }

//                if(growth[n+1] == 10) {
//                    break;
//                }

            }








//        String[] c = new String[]{"abc"};
//        System.out.println("s[0]" + "d");

//        System.out.print(Arrays.toString(new int[]{1,2,3}));

//        int[] nums = new int[] {1, 2, "3", 4}; // mismatch error

//        String[] nums = new String[]{"1", "2", "3", "4"};
//        nums[2] = "0";
//        System.out.println(nums[2]);
    }
}
