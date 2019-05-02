package MethodsWithReturn;

public class BadP {

    public static void main(String[] args) {

        int[] products = {1,1,1,1,0,0,0,0};
        int limit = 5;

        System.out.println(BadP(products, limit));

    }

    public static boolean BadP(int[] products, int limit) {

        int counter = 0;
        boolean shipment = true;

        for(int product : products) {

            if(product == 0) {
                counter++;
            }

        }

        if(counter >= limit) {
            shipment = false;
        }

        return shipment;

    }

}
