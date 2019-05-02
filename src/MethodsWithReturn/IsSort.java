package MethodsWithReturn;

public class IsSort {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        System.out.println(isSort(arr));

    }

    public static boolean isSort(int[] arr) {

        boolean sorted = false;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
            else {
                sorted = true;
            }

        }

        return sorted;

    }

}
