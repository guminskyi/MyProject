package MethodsWithReturn;

public class HamletQuote {

    public static void main(String[] args) {

        System.out.println(HamletQuote(false,false));

    }

    public static boolean HamletQuote(boolean be1, boolean be2) {

        if(be1 == true || be2 == true) {
            return true;
        } else {
            return false;
        }

    }

}
