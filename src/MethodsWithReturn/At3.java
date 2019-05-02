package MethodsWithReturn;

public class At3 {

    public static void main(String[] args) {

        System.out.println(At3("gong", "long"));

    }


    public static String At3(String big, String little) {

        return big.substring(0,3) + little + big.substring(3);

    }

}
