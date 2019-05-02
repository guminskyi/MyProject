package MethodsWithReturn;

public class Factorial {

    public static void main(String[] args) {

        int num = -1;
        int fact = 1;
        //Factorial(num);


        if (fact >= Integer.MAX_VALUE) {
            System.out.println("Num is too big, try something with less value");
        }

    }

    public static void Factorial(int num) {

        int fact = 1;

        if (num < 0) {
            System.out.println("Can't do it for negative numbers");
        } else if (num == 0) {
            fact = 1;
        } else {
            for(int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        // return fact;

    }

}
