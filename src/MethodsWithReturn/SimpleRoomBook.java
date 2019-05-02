package MethodsWithReturn;

public class SimpleRoomBook {

    public static void main(String[] args) {

        System.out.println(SimpleRoomBook(true, 7,5,2018));

    }

    public static boolean SimpleRoomBook(boolean available, int month, int day, int year) {

        if(month == 7 && day >= 1 && day <= 8) {

            return false;

        } else if(year != 2018) {

            return false;

        } else if(!available) {

            return false;

        } else {

            return true;

        }

    }

}
