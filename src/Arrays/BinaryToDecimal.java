package Arrays;

import java.util.*;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,1,1,1};

        System.out.println(BinaryToDecimal(arr));

    }

    public static int BinaryToDecimal(int[] arr) {

        int num = 0;
        int[] binary = {128,64,32,16,8,4,2,1};

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 1) {
                arr[i] = binary[i];
            }
            num += arr[i];

        }

        return num;

    }

}
