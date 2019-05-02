package MethodsWithReturn;

public class WaterTax {

    public static void main(String[] args) {

        System.out.println(WaterBill(154));

    }

    public static double WaterBill(double units) {

        double bill = 0;

        if(units < 50) {
            bill = units * 0.6;
        } else if(units >= 50 & units < 100) {
            bill = units * 0.9;
        } else if(units >= 100 && units < 150) {
            bill = (units * 0.9) + 50;
        } else {
            bill = (units * 0.9) + 100;
        }

        return bill;

    }

}
