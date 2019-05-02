package MethodsWithReturn;

import java.util.*;

public class Scalar {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3}, {4,5,6}};
        int num = 5;
        System.out.println(Arrays.deepToString(Scalar(matrix, num)));

    }

    public static int[][] Scalar(int[][] matrix, int num) {

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= num;
            }
        }

        return matrix;

    }

}
