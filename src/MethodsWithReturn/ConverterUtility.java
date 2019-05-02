package MethodsWithReturn;

public class ConverterUtility {

    // write method miles2Km, accepts miles and returns km value (double)
    // write method fahrenheitToCelcius (int)

    public static void main(String[] args) {

        System.out.println(miles2Km(55.0));
        double kmValue = miles2Km(10);
        System.out.println(kmValue);

        if(miles2Km(55) < 100.0) {
            System.out.println("Speed is good");
        } else {
            System.out.println("Slow down");
        }

        double val = mile2KmV2(98.0);
        System.out.println(val);

        double res = fahrenheitToCelsius(0);
        if(res == -17) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }


    }

    public static double miles2Km(double miles) {

        double kms = miles * 1.6;
        return kms;

    }

    public static double mile2KmV2(double miles) {

        double kms = CalculatorV2.multiply(miles, 1.6);
        return kms;

    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;

    }

}
