package Arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        String[] words = {"cake", "tomato", "wooden spoon", "pizza"};

        Arrays.sort(words);

        // print all in 1 line
        System.out.println(Arrays.toString(words));


        // find an idx of a specific element of an array. Basically indexOf of arrays
        System.out.println(Arrays.binarySearch(words, "pizza"));


        // finding an index of a specific String array element without sorting them first
        String[] words2 = {"cake", "jelly", "jam", "Nutella"};
        int index = -1;

        for(int i = 0; i < words2.length; i++) {
            if(words2[i].equals("jam")) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        if(index == -1) {
            System.out.println("Not found");
        }

    }
}
