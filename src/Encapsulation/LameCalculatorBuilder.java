package Encapsulation;

public class LameCalculatorBuilder {

    public static void main(String[] args) {

//        LameCalculator lc = new LameCalculator();
//        lc.plus = "+";
//        lc.minus = "-";
//        lc.multiply = "*";
//        lc.divide = "/";

        int n1 = 10;
        int n2 = 2;

        System.out.println("The sum is: " + plus(n1, n2));
        System.out.println("The difference is: " + minus(n1, n2));
        System.out.println("The product is: " + multiply(n1, n2));
        System.out.println("The quotient is: " + divide(n1, n2));

    }

    public static int plus(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static int minus(int n1, int n2) {
        int difference = n1 - n2;
        return difference;
    }

    public static int multiply(int n1, int n2) {
        int product = n1 * n2;
        return product;
    }

    public static int divide(int n1, int n2) {
        int quotient = n1 / n2;
        return quotient;
    }

}
