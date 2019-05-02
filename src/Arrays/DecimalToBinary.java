package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DecimalToBinary {
    public static void main(String[] args) {

        int num = 255;
        int[] arr = DecimalToBinary(num);

        System.out.println(Arrays.toString(arr));

//        System.out.println("Enter a number from 0 to 255:");
//
//        Scanner scn = new Scanner(System.in);

//        int decimal = scn.nextInt();
//        int[] binary = new int[8];
//
//        for(int i = binary.length - 1; i >= 0; i--) {
//            binary[i] = decimal % 2;
//            decimal /= 2;
//        }
//
//        System.out.println(Arrays.toString(binary));

    }

        public static int[] DecimalToBinary(int num) {

            int[] arr = new int[8];

            int[] binary = {128,64,32,16,8,4,2,1};

            for(int i = 0; i < binary.length; i++) {

                if(num >= binary[i]) {
                    num -= binary[i];
                    arr[i] = 1;
                }

            }

            return arr;

        }


    }

