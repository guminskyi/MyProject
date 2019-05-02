package MethodsWithReturn;

import java.util.*;

public class Signum {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        System.out.println(Signum(num));

    }

    public static int Signum(int num) {

        if(num < 0) {
            return -1;
        } else if(num > 0) {
            return 1;
        } else {
            return 0;
        }

    }

}
