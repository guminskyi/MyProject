package stringManipPractice;

public class SecondIdx {
    public static void main(String[] args) {

        String word = "1etsy#2wooden#3spoon";

        int secondIndex = word.indexOf('#', word.indexOf('#')+1);

        System.out.println(secondIndex);

    }
}
