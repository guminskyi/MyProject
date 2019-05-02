package MethodsWithReturn;

public class IsEven {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6};

        IsEven(num);

    }

    public static boolean IsEven(int[] num) {

        boolean even = false;

        for(int i = 0; i < num.length; i++) {
            if(num[i] % 2 == 0) {
                even = true;
                System.out.println(even);
            } else {
                even = false;
                System.out.println(even);
            }
        }

        return even;

    }

}
