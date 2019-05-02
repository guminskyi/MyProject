package MethodsWithReturn;

public class AccumulatorMethods {

    // method getStars accepts an int and returns a string
    // it will return that many *s from method
    // ex. getStars(5) -> *****

    public static void main(String[] args) {

        String myStars = getStars2(5);
        System.out.println(myStars);

        System.out.println();

        int[] nums = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};

        for(int n : nums) {

            System.out.println(getStars2(n));

        }

        System.out.println();

        int myStarsInt = getStars1("*****");
        System.out.println(myStarsInt);

    }

    public static int getStars1 (String stars) {

        int counter = 0;

        for(int i = 0; i < stars.length(); i++) {

            if (stars.charAt(i) == '*') {
               counter++;
            }

        }

        return counter;

    }

    public static String getStars2 (int count) {

        String stars = "";

        for (int i = 1; i <= count; i++) {
            stars += "*";
        }

        return stars;

    }

}
