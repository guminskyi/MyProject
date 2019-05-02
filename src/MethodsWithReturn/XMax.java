package MethodsWithReturn;

import java.util.*;

public class XMax {

    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);

       System.out.println("Enter X");
       int x = scn.nextInt();

       System.out.println("Enter MAX");
       int max = scn.nextInt();

       System.out.println(XMax(x,max));

    }

    public static int XMax(int x, int max) {

        if(x > max) {
            return max;
        } else {
            return x;
        }

    }

}
