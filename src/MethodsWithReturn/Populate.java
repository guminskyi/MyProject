package MethodsWithReturn;

import java.util.*;

public class Populate {

    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println(Arrays.toString(Populate(arr)));

    }

    public static int[] Populate(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            arr[i] = i+1;

        }

        return arr;

    }

}
