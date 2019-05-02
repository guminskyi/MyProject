package MethodsWithReturn;

public class ExtractNum {

    public static void main(String[] args) {

        System.out.println(ExtractNum("zeb810ra!!*(&%%^&10"));

    }

    public static String ExtractNum(String word) {

        String numsOnly = "";

        for(int i = 0; i < word.length(); i++) {

            if(Character.isDigit(word.charAt(i))) {
                numsOnly += word.substring(i,i+1); // or word.charAt(i)
            }

        }

        return numsOnly;

    }

}
