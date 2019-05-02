package Arrays;

import java.util.Arrays;

public class Reversed {
    public static void main(String[] args) {

        String sentence = "Java is fun";

        String splitted[] = sentence.split(" ");

        for (int i = splitted.length - 1; i >= 0; i--) {
            System.out.print(splitted[i] + " ");
        }

    }
}
