package MethodsWithReturn;

public class RemoveFirst {

    public static void main(String[] args) {

        System.out.println(RemoveFirst("zebra"));

    }

    public static String RemoveFirst(String word) {

        return word.substring(1);

    }

}
