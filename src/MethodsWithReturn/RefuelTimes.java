package MethodsWithReturn;

import java.util.ArrayList;

public class RefuelTimes {
    public static void main(String[] args) {

        ArrayList<Integer> deliveries = new ArrayList<>();
        deliveries.add(100);
        deliveries.add(200);
        deliveries.add(11);

        int tank = 10;

        System.out.println(RefuelTimes(deliveries, tank));

    }

    public static int RefuelTimes(ArrayList<Integer> deliveries, int tank) {

        int sum = 0;

        for (int n : deliveries) {

            sum += n;

        }

            if (sum % tank == 0) {
                return sum / tank;
            } else {
                return sum / tank + 1;
            }

    }
}
