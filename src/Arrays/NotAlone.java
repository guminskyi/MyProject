package Arrays;

import java.util.Arrays;

public class NotAlone {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,5,2};

        for(int i = 0; i < arr.length - 1; i++) {

            if(i != 0 && i != arr[arr.length - 1]) {

                if(arr[i-1] > arr[i+1]) {
                    arr[i] = arr[i-1];
                } else {
                    arr[i] = arr[i+1];
                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }
}
