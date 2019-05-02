package MethodsWithReturn;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] arr1 = {10,40,50,3,1,2,3};
        int[] arr2 = {11,0,500,44,1101};
        System.out.println(Arrays.toString(AddElements(arr1,arr2)));

    }

    public static int[] AddElements(int[] arr1, int[] arr2) {

        int[] arrAdded = new int[arr1.length];

        for(int i = 0; i < arr2.length; i++) {
            arrAdded[i] = arr1[i] + arr2[i];
        }

        for(int j = arr2.length; j < arrAdded.length; j++) {
            arrAdded[j] = arr1[j];
        }

        return arrAdded;

    }

}
