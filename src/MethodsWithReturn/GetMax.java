package MethodsWithReturn;

public class GetMax {

    // accepts two ints and return s a larger one

    public static void main(String[] args) {

        System.out.println("Largest number is: " + getMax(10,20));

    }

    public static int getMax(int num1, int num2) {

        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }

    }

}
