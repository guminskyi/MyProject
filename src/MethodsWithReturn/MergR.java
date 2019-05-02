package MethodsWithReturn;

import java.util.*;

public class MergR {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(Arrays.toString(MergR(arr1, arr2)));
    }

    public static int[] MergR(int[] arr1, int[] arr2) {

        int[] newArr = new int[arr1.length + arr2.length];
        int k = 0;


        for(int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for(int j = arr1.length; j < newArr.length; j++) {
            newArr[j] = arr2[k];
            k++;
        }

        return newArr;

    }

}
