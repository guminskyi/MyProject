package MethodsWithReturn;

import java.util.*;

public class Cube {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        System.out.println(Cube(num));

    }

    public static int Cube(int num) {

      int numCube = num * num * num;

      return numCube;

    }

}
