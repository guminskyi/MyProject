package MethodsWithReturn;

public class IsError {

    public static void main(String[] args) {

        System.out.println(IsError("error one two"));

    }

    public static boolean IsError(String word) {

        String[] splitted = word.split(" ");
        boolean isError = false;

            if(splitted[0].equals("error")) {
                isError = true;
            }

        return isError;

    }

}
